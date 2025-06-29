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

import java.util.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK11.*;
import static overrungl.vulkan.VK13.*;
import static overrungl.vulkan.VK14.*;
import static overrungl.vulkan.arm.VKARMFormatPack.*;
import static overrungl.vulkan.arm.VKARMTensors.*;
import static overrungl.vulkan.img.VKIMGFormatPvrtc.*;
import static overrungl.vulkan.nv.VKNVOpticalFlow.*;

/// `VkFormat` adapted from [vulkan_format_traits.hpp](https://github.com/KhronosGroup/Vulkan-Hpp/blob/32f2957efcb552aebcfca3a6e66675ead4d1a240/vulkan/vulkan_format_traits.hpp)
public enum VkFormat {
    UNDEFINED(VK_FORMAT_UNDEFINED, new int[]{1,1,1}, 0, "", null, 0, null, null, null, false, null, false, false, false, false, false, false, 0, 0, null, null, 0),
    R4G4_UNORM_PACK8(VK_FORMAT_R4G4_UNORM_PACK8, new int[]{1,1,1}, 1, "8-bit", new int[]{4, 4}, 2, new String[]{"R", "G"}, new String[]{"UNORM", "UNORM"}, null, false, null, false, false, false, true, true, false, 8, 1, new int[]{1}, new int[]{1}, 1),
    R4G4B4A4_UNORM_PACK16(VK_FORMAT_R4G4B4A4_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{4, 4, 4, 4}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    B4G4R4A4_UNORM_PACK16(VK_FORMAT_B4G4R4A4_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{4, 4, 4, 4}, 4, new String[]{"B", "G", "R", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R5G6B5_UNORM_PACK16(VK_FORMAT_R5G6B5_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{5, 6, 5}, 3, new String[]{"R", "G", "B"}, new String[]{"UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    B5G6R5_UNORM_PACK16(VK_FORMAT_B5G6R5_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{5, 6, 5}, 3, new String[]{"B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R5G5B5A1_UNORM_PACK16(VK_FORMAT_R5G5B5A1_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{5, 5, 5, 1}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    B5G5R5A1_UNORM_PACK16(VK_FORMAT_B5G5R5A1_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{5, 5, 5, 1}, 4, new String[]{"B", "G", "R", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    A1R5G5B5_UNORM_PACK16(VK_FORMAT_A1R5G5B5_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{1, 5, 5, 5}, 4, new String[]{"A", "R", "G", "B"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    A1B5G5R5_UNORM_PACK16(VK_FORMAT_A1B5G5R5_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{1, 5, 5, 5}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    A8_UNORM(VK_FORMAT_A8_UNORM, new int[]{1,1,1}, 1, "8-bit alpha", new int[]{8}, 1, new String[]{"A"}, new String[]{"UNORM"}, null, false, null, true, false, false, false, false, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8_UNORM(VK_FORMAT_R8_UNORM, new int[]{1,1,1}, 1, "8-bit", new int[]{8}, 1, new String[]{"R"}, new String[]{"UNORM"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8_SNORM(VK_FORMAT_R8_SNORM, new int[]{1,1,1}, 1, "8-bit", new int[]{8}, 1, new String[]{"R"}, new String[]{"SNORM"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8_USCALED(VK_FORMAT_R8_USCALED, new int[]{1,1,1}, 1, "8-bit", new int[]{8}, 1, new String[]{"R"}, new String[]{"USCALED"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8_SSCALED(VK_FORMAT_R8_SSCALED, new int[]{1,1,1}, 1, "8-bit", new int[]{8}, 1, new String[]{"R"}, new String[]{"SSCALED"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8_UINT(VK_FORMAT_R8_UINT, new int[]{1,1,1}, 1, "8-bit", new int[]{8}, 1, new String[]{"R"}, new String[]{"UINT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8_SINT(VK_FORMAT_R8_SINT, new int[]{1,1,1}, 1, "8-bit", new int[]{8}, 1, new String[]{"R"}, new String[]{"SINT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8_SRGB(VK_FORMAT_R8_SRGB, new int[]{1,1,1}, 1, "8-bit", new int[]{8}, 1, new String[]{"R"}, new String[]{"SRGB"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8_UNORM(VK_FORMAT_R8G8_UNORM, new int[]{1,1,1}, 2, "16-bit", new int[]{8, 8}, 2, new String[]{"R", "G"}, new String[]{"UNORM", "UNORM"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8_SNORM(VK_FORMAT_R8G8_SNORM, new int[]{1,1,1}, 2, "16-bit", new int[]{8, 8}, 2, new String[]{"R", "G"}, new String[]{"SNORM", "SNORM"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8_USCALED(VK_FORMAT_R8G8_USCALED, new int[]{1,1,1}, 2, "16-bit", new int[]{8, 8}, 2, new String[]{"R", "G"}, new String[]{"USCALED", "USCALED"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8_SSCALED(VK_FORMAT_R8G8_SSCALED, new int[]{1,1,1}, 2, "16-bit", new int[]{8, 8}, 2, new String[]{"R", "G"}, new String[]{"SSCALED", "SSCALED"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8_UINT(VK_FORMAT_R8G8_UINT, new int[]{1,1,1}, 2, "16-bit", new int[]{8, 8}, 2, new String[]{"R", "G"}, new String[]{"UINT", "UINT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8_SINT(VK_FORMAT_R8G8_SINT, new int[]{1,1,1}, 2, "16-bit", new int[]{8, 8}, 2, new String[]{"R", "G"}, new String[]{"SINT", "SINT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8_SRGB(VK_FORMAT_R8G8_SRGB, new int[]{1,1,1}, 2, "16-bit", new int[]{8, 8}, 2, new String[]{"R", "G"}, new String[]{"SRGB", "SRGB"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8_UNORM(VK_FORMAT_R8G8B8_UNORM, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"R", "G", "B"}, new String[]{"UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8_SNORM(VK_FORMAT_R8G8B8_SNORM, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"R", "G", "B"}, new String[]{"SNORM", "SNORM", "SNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8_USCALED(VK_FORMAT_R8G8B8_USCALED, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"R", "G", "B"}, new String[]{"USCALED", "USCALED", "USCALED"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8_SSCALED(VK_FORMAT_R8G8B8_SSCALED, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"R", "G", "B"}, new String[]{"SSCALED", "SSCALED", "SSCALED"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8_UINT(VK_FORMAT_R8G8B8_UINT, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"R", "G", "B"}, new String[]{"UINT", "UINT", "UINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8_SINT(VK_FORMAT_R8G8B8_SINT, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"R", "G", "B"}, new String[]{"SINT", "SINT", "SINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8_SRGB(VK_FORMAT_R8G8B8_SRGB, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"R", "G", "B"}, new String[]{"SRGB", "SRGB", "SRGB"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8_UNORM(VK_FORMAT_B8G8R8_UNORM, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8_SNORM(VK_FORMAT_B8G8R8_SNORM, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"B", "G", "R"}, new String[]{"SNORM", "SNORM", "SNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8_USCALED(VK_FORMAT_B8G8R8_USCALED, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"B", "G", "R"}, new String[]{"USCALED", "USCALED", "USCALED"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8_SSCALED(VK_FORMAT_B8G8R8_SSCALED, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"B", "G", "R"}, new String[]{"SSCALED", "SSCALED", "SSCALED"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8_UINT(VK_FORMAT_B8G8R8_UINT, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"B", "G", "R"}, new String[]{"UINT", "UINT", "UINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8_SINT(VK_FORMAT_B8G8R8_SINT, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"B", "G", "R"}, new String[]{"SINT", "SINT", "SINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8_SRGB(VK_FORMAT_B8G8R8_SRGB, new int[]{1,1,1}, 3, "24-bit", new int[]{8, 8, 8}, 3, new String[]{"B", "G", "R"}, new String[]{"SRGB", "SRGB", "SRGB"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8A8_UNORM(VK_FORMAT_R8G8B8A8_UNORM, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8A8_SNORM(VK_FORMAT_R8G8B8A8_SNORM, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SNORM", "SNORM", "SNORM", "SNORM"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8A8_USCALED(VK_FORMAT_R8G8B8A8_USCALED, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"USCALED", "USCALED", "USCALED", "USCALED"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8A8_SSCALED(VK_FORMAT_R8G8B8A8_SSCALED, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SSCALED", "SSCALED", "SSCALED", "SSCALED"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8A8_UINT(VK_FORMAT_R8G8B8A8_UINT, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8A8_SINT(VK_FORMAT_R8G8B8A8_SINT, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SINT", "SINT", "SINT", "SINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R8G8B8A8_SRGB(VK_FORMAT_R8G8B8A8_SRGB, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8A8_UNORM(VK_FORMAT_B8G8R8A8_UNORM, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"B", "G", "R", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8A8_SNORM(VK_FORMAT_B8G8R8A8_SNORM, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"B", "G", "R", "A"}, new String[]{"SNORM", "SNORM", "SNORM", "SNORM"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8A8_USCALED(VK_FORMAT_B8G8R8A8_USCALED, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"B", "G", "R", "A"}, new String[]{"USCALED", "USCALED", "USCALED", "USCALED"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8A8_SSCALED(VK_FORMAT_B8G8R8A8_SSCALED, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"B", "G", "R", "A"}, new String[]{"SSCALED", "SSCALED", "SSCALED", "SSCALED"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8A8_UINT(VK_FORMAT_B8G8R8A8_UINT, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"B", "G", "R", "A"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8A8_SINT(VK_FORMAT_B8G8R8A8_SINT, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"B", "G", "R", "A"}, new String[]{"SINT", "SINT", "SINT", "SINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8A8_SRGB(VK_FORMAT_B8G8R8A8_SRGB, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"B", "G", "R", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    A8B8G8R8_UNORM_PACK32(VK_FORMAT_A8B8G8R8_UNORM_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A8B8G8R8_SNORM_PACK32(VK_FORMAT_A8B8G8R8_SNORM_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"SNORM", "SNORM", "SNORM", "SNORM"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A8B8G8R8_USCALED_PACK32(VK_FORMAT_A8B8G8R8_USCALED_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"USCALED", "USCALED", "USCALED", "USCALED"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A8B8G8R8_SSCALED_PACK32(VK_FORMAT_A8B8G8R8_SSCALED_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"SSCALED", "SSCALED", "SSCALED", "SSCALED"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A8B8G8R8_UINT_PACK32(VK_FORMAT_A8B8G8R8_UINT_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A8B8G8R8_SINT_PACK32(VK_FORMAT_A8B8G8R8_SINT_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"SINT", "SINT", "SINT", "SINT"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A8B8G8R8_SRGB_PACK32(VK_FORMAT_A8B8G8R8_SRGB_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{8, 8, 8, 8}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"UNORM", "SRGB", "SRGB", "SRGB"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2R10G10B10_UNORM_PACK32(VK_FORMAT_A2R10G10B10_UNORM_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "R", "G", "B"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2R10G10B10_SNORM_PACK32(VK_FORMAT_A2R10G10B10_SNORM_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "R", "G", "B"}, new String[]{"SNORM", "SNORM", "SNORM", "SNORM"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2R10G10B10_USCALED_PACK32(VK_FORMAT_A2R10G10B10_USCALED_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "R", "G", "B"}, new String[]{"USCALED", "USCALED", "USCALED", "USCALED"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2R10G10B10_SSCALED_PACK32(VK_FORMAT_A2R10G10B10_SSCALED_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "R", "G", "B"}, new String[]{"SSCALED", "SSCALED", "SSCALED", "SSCALED"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2R10G10B10_UINT_PACK32(VK_FORMAT_A2R10G10B10_UINT_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "R", "G", "B"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2R10G10B10_SINT_PACK32(VK_FORMAT_A2R10G10B10_SINT_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "R", "G", "B"}, new String[]{"SINT", "SINT", "SINT", "SINT"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2B10G10R10_UNORM_PACK32(VK_FORMAT_A2B10G10R10_UNORM_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2B10G10R10_SNORM_PACK32(VK_FORMAT_A2B10G10R10_SNORM_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"SNORM", "SNORM", "SNORM", "SNORM"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2B10G10R10_USCALED_PACK32(VK_FORMAT_A2B10G10R10_USCALED_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"USCALED", "USCALED", "USCALED", "USCALED"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2B10G10R10_SSCALED_PACK32(VK_FORMAT_A2B10G10R10_SSCALED_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"SSCALED", "SSCALED", "SSCALED", "SSCALED"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2B10G10R10_UINT_PACK32(VK_FORMAT_A2B10G10R10_UINT_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    A2B10G10R10_SINT_PACK32(VK_FORMAT_A2B10G10R10_SINT_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{2, 10, 10, 10}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"SINT", "SINT", "SINT", "SINT"}, null, false, null, true, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    R16_UNORM(VK_FORMAT_R16_UNORM, new int[]{1,1,1}, 2, "16-bit", new int[]{16}, 1, new String[]{"R"}, new String[]{"UNORM"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16_SNORM(VK_FORMAT_R16_SNORM, new int[]{1,1,1}, 2, "16-bit", new int[]{16}, 1, new String[]{"R"}, new String[]{"SNORM"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16_USCALED(VK_FORMAT_R16_USCALED, new int[]{1,1,1}, 2, "16-bit", new int[]{16}, 1, new String[]{"R"}, new String[]{"USCALED"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16_SSCALED(VK_FORMAT_R16_SSCALED, new int[]{1,1,1}, 2, "16-bit", new int[]{16}, 1, new String[]{"R"}, new String[]{"SSCALED"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16_UINT(VK_FORMAT_R16_UINT, new int[]{1,1,1}, 2, "16-bit", new int[]{16}, 1, new String[]{"R"}, new String[]{"UINT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16_SINT(VK_FORMAT_R16_SINT, new int[]{1,1,1}, 2, "16-bit", new int[]{16}, 1, new String[]{"R"}, new String[]{"SINT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16_SFLOAT(VK_FORMAT_R16_SFLOAT, new int[]{1,1,1}, 2, "16-bit", new int[]{16}, 1, new String[]{"R"}, new String[]{"SFLOAT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16_UNORM(VK_FORMAT_R16G16_UNORM, new int[]{1,1,1}, 4, "32-bit", new int[]{16, 16}, 2, new String[]{"R", "G"}, new String[]{"UNORM", "UNORM"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16_SNORM(VK_FORMAT_R16G16_SNORM, new int[]{1,1,1}, 4, "32-bit", new int[]{16, 16}, 2, new String[]{"R", "G"}, new String[]{"SNORM", "SNORM"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16_USCALED(VK_FORMAT_R16G16_USCALED, new int[]{1,1,1}, 4, "32-bit", new int[]{16, 16}, 2, new String[]{"R", "G"}, new String[]{"USCALED", "USCALED"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16_SSCALED(VK_FORMAT_R16G16_SSCALED, new int[]{1,1,1}, 4, "32-bit", new int[]{16, 16}, 2, new String[]{"R", "G"}, new String[]{"SSCALED", "SSCALED"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16_UINT(VK_FORMAT_R16G16_UINT, new int[]{1,1,1}, 4, "32-bit", new int[]{16, 16}, 2, new String[]{"R", "G"}, new String[]{"UINT", "UINT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16_SINT(VK_FORMAT_R16G16_SINT, new int[]{1,1,1}, 4, "32-bit", new int[]{16, 16}, 2, new String[]{"R", "G"}, new String[]{"SINT", "SINT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16_SFLOAT(VK_FORMAT_R16G16_SFLOAT, new int[]{1,1,1}, 4, "32-bit", new int[]{16, 16}, 2, new String[]{"R", "G"}, new String[]{"SFLOAT", "SFLOAT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16_UNORM(VK_FORMAT_R16G16B16_UNORM, new int[]{1,1,1}, 6, "48-bit", new int[]{16, 16, 16}, 3, new String[]{"R", "G", "B"}, new String[]{"UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16_SNORM(VK_FORMAT_R16G16B16_SNORM, new int[]{1,1,1}, 6, "48-bit", new int[]{16, 16, 16}, 3, new String[]{"R", "G", "B"}, new String[]{"SNORM", "SNORM", "SNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16_USCALED(VK_FORMAT_R16G16B16_USCALED, new int[]{1,1,1}, 6, "48-bit", new int[]{16, 16, 16}, 3, new String[]{"R", "G", "B"}, new String[]{"USCALED", "USCALED", "USCALED"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16_SSCALED(VK_FORMAT_R16G16B16_SSCALED, new int[]{1,1,1}, 6, "48-bit", new int[]{16, 16, 16}, 3, new String[]{"R", "G", "B"}, new String[]{"SSCALED", "SSCALED", "SSCALED"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16_UINT(VK_FORMAT_R16G16B16_UINT, new int[]{1,1,1}, 6, "48-bit", new int[]{16, 16, 16}, 3, new String[]{"R", "G", "B"}, new String[]{"UINT", "UINT", "UINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16_SINT(VK_FORMAT_R16G16B16_SINT, new int[]{1,1,1}, 6, "48-bit", new int[]{16, 16, 16}, 3, new String[]{"R", "G", "B"}, new String[]{"SINT", "SINT", "SINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16_SFLOAT(VK_FORMAT_R16G16B16_SFLOAT, new int[]{1,1,1}, 6, "48-bit", new int[]{16, 16, 16}, 3, new String[]{"R", "G", "B"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16A16_UNORM(VK_FORMAT_R16G16B16A16_UNORM, new int[]{1,1,1}, 8, "64-bit", new int[]{16, 16, 16, 16}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16A16_SNORM(VK_FORMAT_R16G16B16A16_SNORM, new int[]{1,1,1}, 8, "64-bit", new int[]{16, 16, 16, 16}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SNORM", "SNORM", "SNORM", "SNORM"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16A16_USCALED(VK_FORMAT_R16G16B16A16_USCALED, new int[]{1,1,1}, 8, "64-bit", new int[]{16, 16, 16, 16}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"USCALED", "USCALED", "USCALED", "USCALED"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16A16_SSCALED(VK_FORMAT_R16G16B16A16_SSCALED, new int[]{1,1,1}, 8, "64-bit", new int[]{16, 16, 16, 16}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SSCALED", "SSCALED", "SSCALED", "SSCALED"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16A16_UINT(VK_FORMAT_R16G16B16A16_UINT, new int[]{1,1,1}, 8, "64-bit", new int[]{16, 16, 16, 16}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16A16_SINT(VK_FORMAT_R16G16B16A16_SINT, new int[]{1,1,1}, 8, "64-bit", new int[]{16, 16, 16, 16}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SINT", "SINT", "SINT", "SINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R16G16B16A16_SFLOAT(VK_FORMAT_R16G16B16A16_SFLOAT, new int[]{1,1,1}, 8, "64-bit", new int[]{16, 16, 16, 16}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32_UINT(VK_FORMAT_R32_UINT, new int[]{1,1,1}, 4, "32-bit", new int[]{32}, 1, new String[]{"R"}, new String[]{"UINT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32_SINT(VK_FORMAT_R32_SINT, new int[]{1,1,1}, 4, "32-bit", new int[]{32}, 1, new String[]{"R"}, new String[]{"SINT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32_SFLOAT(VK_FORMAT_R32_SFLOAT, new int[]{1,1,1}, 4, "32-bit", new int[]{32}, 1, new String[]{"R"}, new String[]{"SFLOAT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32G32_UINT(VK_FORMAT_R32G32_UINT, new int[]{1,1,1}, 8, "64-bit", new int[]{32, 32}, 2, new String[]{"R", "G"}, new String[]{"UINT", "UINT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32G32_SINT(VK_FORMAT_R32G32_SINT, new int[]{1,1,1}, 8, "64-bit", new int[]{32, 32}, 2, new String[]{"R", "G"}, new String[]{"SINT", "SINT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32G32_SFLOAT(VK_FORMAT_R32G32_SFLOAT, new int[]{1,1,1}, 8, "64-bit", new int[]{32, 32}, 2, new String[]{"R", "G"}, new String[]{"SFLOAT", "SFLOAT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32G32B32_UINT(VK_FORMAT_R32G32B32_UINT, new int[]{1,1,1}, 12, "96-bit", new int[]{32, 32, 32}, 3, new String[]{"R", "G", "B"}, new String[]{"UINT", "UINT", "UINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32G32B32_SINT(VK_FORMAT_R32G32B32_SINT, new int[]{1,1,1}, 12, "96-bit", new int[]{32, 32, 32}, 3, new String[]{"R", "G", "B"}, new String[]{"SINT", "SINT", "SINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32G32B32_SFLOAT(VK_FORMAT_R32G32B32_SFLOAT, new int[]{1,1,1}, 12, "96-bit", new int[]{32, 32, 32}, 3, new String[]{"R", "G", "B"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32G32B32A32_UINT(VK_FORMAT_R32G32B32A32_UINT, new int[]{1,1,1}, 16, "128-bit", new int[]{32, 32, 32, 32}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32G32B32A32_SINT(VK_FORMAT_R32G32B32A32_SINT, new int[]{1,1,1}, 16, "128-bit", new int[]{32, 32, 32, 32}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SINT", "SINT", "SINT", "SINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R32G32B32A32_SFLOAT(VK_FORMAT_R32G32B32A32_SFLOAT, new int[]{1,1,1}, 16, "128-bit", new int[]{32, 32, 32, 32}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64_UINT(VK_FORMAT_R64_UINT, new int[]{1,1,1}, 8, "64-bit", new int[]{64}, 1, new String[]{"R"}, new String[]{"UINT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64_SINT(VK_FORMAT_R64_SINT, new int[]{1,1,1}, 8, "64-bit", new int[]{64}, 1, new String[]{"R"}, new String[]{"SINT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64_SFLOAT(VK_FORMAT_R64_SFLOAT, new int[]{1,1,1}, 8, "64-bit", new int[]{64}, 1, new String[]{"R"}, new String[]{"SFLOAT"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64G64_UINT(VK_FORMAT_R64G64_UINT, new int[]{1,1,1}, 16, "128-bit", new int[]{64, 64}, 2, new String[]{"R", "G"}, new String[]{"UINT", "UINT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64G64_SINT(VK_FORMAT_R64G64_SINT, new int[]{1,1,1}, 16, "128-bit", new int[]{64, 64}, 2, new String[]{"R", "G"}, new String[]{"SINT", "SINT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64G64_SFLOAT(VK_FORMAT_R64G64_SFLOAT, new int[]{1,1,1}, 16, "128-bit", new int[]{64, 64}, 2, new String[]{"R", "G"}, new String[]{"SFLOAT", "SFLOAT"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64G64B64_UINT(VK_FORMAT_R64G64B64_UINT, new int[]{1,1,1}, 24, "192-bit", new int[]{64, 64, 64}, 3, new String[]{"R", "G", "B"}, new String[]{"UINT", "UINT", "UINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64G64B64_SINT(VK_FORMAT_R64G64B64_SINT, new int[]{1,1,1}, 24, "192-bit", new int[]{64, 64, 64}, 3, new String[]{"R", "G", "B"}, new String[]{"SINT", "SINT", "SINT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64G64B64_SFLOAT(VK_FORMAT_R64G64B64_SFLOAT, new int[]{1,1,1}, 24, "192-bit", new int[]{64, 64, 64}, 3, new String[]{"R", "G", "B"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64G64B64A64_UINT(VK_FORMAT_R64G64B64A64_UINT, new int[]{1,1,1}, 32, "256-bit", new int[]{64, 64, 64, 64}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64G64B64A64_SINT(VK_FORMAT_R64G64B64A64_SINT, new int[]{1,1,1}, 32, "256-bit", new int[]{64, 64, 64, 64}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SINT", "SINT", "SINT", "SINT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R64G64B64A64_SFLOAT(VK_FORMAT_R64G64B64A64_SFLOAT, new int[]{1,1,1}, 32, "256-bit", new int[]{64, 64, 64, 64}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, false, null, true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B10G11R11_UFLOAT_PACK32(VK_FORMAT_B10G11R11_UFLOAT_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{10, 11, 11}, 3, new String[]{"B", "G", "R"}, new String[]{"UFLOAT", "UFLOAT", "UFLOAT"}, null, false, null, false, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    E5B9G9R9_UFLOAT_PACK32(VK_FORMAT_E5B9G9R9_UFLOAT_PACK32, new int[]{1,1,1}, 4, "32-bit", new int[]{9, 9, 9}, 3, new String[]{"B", "G", "R"}, new String[]{"UFLOAT", "UFLOAT", "UFLOAT"}, null, false, null, false, true, false, true, true, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    D16_UNORM(VK_FORMAT_D16_UNORM, new int[]{1,1,1}, 2, "D16", new int[]{16}, 1, new String[]{"D"}, new String[]{"UNORM"}, null, false, null, false, false, true, false, false, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    X8_D24_UNORM_PACK32(VK_FORMAT_X8_D24_UNORM_PACK32, new int[]{1,1,1}, 4, "D24", new int[]{24}, 1, new String[]{"D"}, new String[]{"UNORM"}, null, false, null, false, false, true, false, false, false, 32, 1, new int[]{1}, new int[]{1}, 1),
    D32_SFLOAT(VK_FORMAT_D32_SFLOAT, new int[]{1,1,1}, 4, "D32", new int[]{32}, 1, new String[]{"D"}, new String[]{"SFLOAT"}, null, false, null, false, false, true, false, false, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    S8_UINT(VK_FORMAT_S8_UINT, new int[]{1,1,1}, 1, "S8", new int[]{8}, 1, new String[]{"S"}, new String[]{"UINT"}, null, false, null, false, false, false, false, false, true, 0, 1, new int[]{1}, new int[]{1}, 1),
    D16_UNORM_S8_UINT(VK_FORMAT_D16_UNORM_S8_UINT, new int[]{1,1,1}, 3, "D16S8", new int[]{16, 8}, 2, new String[]{"D", "S"}, new String[]{"UNORM", "UINT"}, null, false, null, false, false, true, false, false, true, 0, 1, new int[]{1}, new int[]{1}, 1),
    D24_UNORM_S8_UINT(VK_FORMAT_D24_UNORM_S8_UINT, new int[]{1,1,1}, 4, "D24S8", new int[]{24, 8}, 2, new String[]{"D", "S"}, new String[]{"UNORM", "UINT"}, null, false, null, false, false, true, false, false, true, 0, 1, new int[]{1}, new int[]{1}, 1),
    D32_SFLOAT_S8_UINT(VK_FORMAT_D32_SFLOAT_S8_UINT, new int[]{1,1,1}, 5, "D32S8", new int[]{32, 8}, 2, new String[]{"D", "S"}, new String[]{"SFLOAT", "UINT"}, null, false, null, false, false, true, false, false, true, 0, 1, new int[]{1}, new int[]{1}, 1),
    BC1_RGB_UNORM_BLOCK(VK_FORMAT_BC1_RGB_UNORM_BLOCK, new int[]{4,4,1}, 8, "BC1_RGB", null, 3, new String[]{"R", "G", "B"}, new String[]{"UNORM", "UNORM", "UNORM"}, null, true, "BC", false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC1_RGB_SRGB_BLOCK(VK_FORMAT_BC1_RGB_SRGB_BLOCK, new int[]{4,4,1}, 8, "BC1_RGB", null, 3, new String[]{"R", "G", "B"}, new String[]{"SRGB", "SRGB", "SRGB"}, null, true, "BC", false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC1_RGBA_UNORM_BLOCK(VK_FORMAT_BC1_RGBA_UNORM_BLOCK, new int[]{4,4,1}, 8, "BC1_RGBA", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "BC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC1_RGBA_SRGB_BLOCK(VK_FORMAT_BC1_RGBA_SRGB_BLOCK, new int[]{4,4,1}, 8, "BC1_RGBA", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "BC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC2_UNORM_BLOCK(VK_FORMAT_BC2_UNORM_BLOCK, new int[]{4,4,1}, 16, "BC2", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "BC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC2_SRGB_BLOCK(VK_FORMAT_BC2_SRGB_BLOCK, new int[]{4,4,1}, 16, "BC2", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "BC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC3_UNORM_BLOCK(VK_FORMAT_BC3_UNORM_BLOCK, new int[]{4,4,1}, 16, "BC3", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "BC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC3_SRGB_BLOCK(VK_FORMAT_BC3_SRGB_BLOCK, new int[]{4,4,1}, 16, "BC3", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "BC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC4_UNORM_BLOCK(VK_FORMAT_BC4_UNORM_BLOCK, new int[]{4,4,1}, 8, "BC4", null, 1, new String[]{"R"}, new String[]{"UNORM"}, null, true, "BC", false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC4_SNORM_BLOCK(VK_FORMAT_BC4_SNORM_BLOCK, new int[]{4,4,1}, 8, "BC4", null, 1, new String[]{"R"}, new String[]{"SNORM"}, null, true, "BC", false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC5_UNORM_BLOCK(VK_FORMAT_BC5_UNORM_BLOCK, new int[]{4,4,1}, 16, "BC5", null, 2, new String[]{"R", "G"}, new String[]{"UNORM", "UNORM"}, null, true, "BC", false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC5_SNORM_BLOCK(VK_FORMAT_BC5_SNORM_BLOCK, new int[]{4,4,1}, 16, "BC5", null, 2, new String[]{"R", "G"}, new String[]{"SNORM", "SNORM"}, null, true, "BC", false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC6H_UFLOAT_BLOCK(VK_FORMAT_BC6H_UFLOAT_BLOCK, new int[]{4,4,1}, 16, "BC6H", null, 3, new String[]{"R", "G", "B"}, new String[]{"UFLOAT", "UFLOAT", "UFLOAT"}, null, true, "BC", false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC6H_SFLOAT_BLOCK(VK_FORMAT_BC6H_SFLOAT_BLOCK, new int[]{4,4,1}, 16, "BC6H", null, 3, new String[]{"R", "G", "B"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "BC", false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC7_UNORM_BLOCK(VK_FORMAT_BC7_UNORM_BLOCK, new int[]{4,4,1}, 16, "BC7", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "BC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    BC7_SRGB_BLOCK(VK_FORMAT_BC7_SRGB_BLOCK, new int[]{4,4,1}, 16, "BC7", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "BC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ETC2_R8G8B8_UNORM_BLOCK(VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK, new int[]{4,4,1}, 8, "ETC2_RGB", null, 3, new String[]{"R", "G", "B"}, new String[]{"UNORM", "UNORM", "UNORM"}, null, true, "ETC2", false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ETC2_R8G8B8_SRGB_BLOCK(VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK, new int[]{4,4,1}, 8, "ETC2_RGB", null, 3, new String[]{"R", "G", "B"}, new String[]{"SRGB", "SRGB", "SRGB"}, null, true, "ETC2", false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ETC2_R8G8B8A1_UNORM_BLOCK(VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK, new int[]{4,4,1}, 8, "ETC2_RGBA", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ETC2", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ETC2_R8G8B8A1_SRGB_BLOCK(VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK, new int[]{4,4,1}, 8, "ETC2_RGBA", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ETC2", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ETC2_R8G8B8A8_UNORM_BLOCK(VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK, new int[]{4,4,1}, 16, "ETC2_EAC_RGBA", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ETC2", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ETC2_R8G8B8A8_SRGB_BLOCK(VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK, new int[]{4,4,1}, 16, "ETC2_EAC_RGBA", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ETC2", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    EAC_R11_UNORM_BLOCK(VK_FORMAT_EAC_R11_UNORM_BLOCK, new int[]{4,4,1}, 8, "EAC_R", new int[]{11}, 1, new String[]{"R"}, new String[]{"UNORM"}, null, false, "EAC", false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    EAC_R11_SNORM_BLOCK(VK_FORMAT_EAC_R11_SNORM_BLOCK, new int[]{4,4,1}, 8, "EAC_R", new int[]{11}, 1, new String[]{"R"}, new String[]{"SNORM"}, null, false, "EAC", false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    EAC_R11G11_UNORM_BLOCK(VK_FORMAT_EAC_R11G11_UNORM_BLOCK, new int[]{4,4,1}, 16, "EAC_RG", new int[]{11, 11}, 2, new String[]{"R", "G"}, new String[]{"UNORM", "UNORM"}, null, false, "EAC", false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    EAC_R11G11_SNORM_BLOCK(VK_FORMAT_EAC_R11G11_SNORM_BLOCK, new int[]{4,4,1}, 16, "EAC_RG", new int[]{11, 11}, 2, new String[]{"R", "G"}, new String[]{"SNORM", "SNORM"}, null, false, "EAC", false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ASTC_4x4_UNORM_BLOCK(VK_FORMAT_ASTC_4x4_UNORM_BLOCK, new int[]{4,4,1}, 16, "ASTC_4x4", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ASTC_4x4_SRGB_BLOCK(VK_FORMAT_ASTC_4x4_SRGB_BLOCK, new int[]{4,4,1}, 16, "ASTC_4x4", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ASTC_5x4_UNORM_BLOCK(VK_FORMAT_ASTC_5x4_UNORM_BLOCK, new int[]{5,4,1}, 16, "ASTC_5x4", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 20),
    ASTC_5x4_SRGB_BLOCK(VK_FORMAT_ASTC_5x4_SRGB_BLOCK, new int[]{5,4,1}, 16, "ASTC_5x4", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 20),
    ASTC_5x5_UNORM_BLOCK(VK_FORMAT_ASTC_5x5_UNORM_BLOCK, new int[]{5,5,1}, 16, "ASTC_5x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 25),
    ASTC_5x5_SRGB_BLOCK(VK_FORMAT_ASTC_5x5_SRGB_BLOCK, new int[]{5,5,1}, 16, "ASTC_5x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 25),
    ASTC_6x5_UNORM_BLOCK(VK_FORMAT_ASTC_6x5_UNORM_BLOCK, new int[]{6,5,1}, 16, "ASTC_6x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 30),
    ASTC_6x5_SRGB_BLOCK(VK_FORMAT_ASTC_6x5_SRGB_BLOCK, new int[]{6,5,1}, 16, "ASTC_6x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 30),
    ASTC_6x6_UNORM_BLOCK(VK_FORMAT_ASTC_6x6_UNORM_BLOCK, new int[]{6,6,1}, 16, "ASTC_6x6", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 36),
    ASTC_6x6_SRGB_BLOCK(VK_FORMAT_ASTC_6x6_SRGB_BLOCK, new int[]{6,6,1}, 16, "ASTC_6x6", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 36),
    ASTC_8x5_UNORM_BLOCK(VK_FORMAT_ASTC_8x5_UNORM_BLOCK, new int[]{8,5,1}, 16, "ASTC_8x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 40),
    ASTC_8x5_SRGB_BLOCK(VK_FORMAT_ASTC_8x5_SRGB_BLOCK, new int[]{8,5,1}, 16, "ASTC_8x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 40),
    ASTC_8x6_UNORM_BLOCK(VK_FORMAT_ASTC_8x6_UNORM_BLOCK, new int[]{8,6,1}, 16, "ASTC_8x6", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 48),
    ASTC_8x6_SRGB_BLOCK(VK_FORMAT_ASTC_8x6_SRGB_BLOCK, new int[]{8,6,1}, 16, "ASTC_8x6", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 48),
    ASTC_8x8_UNORM_BLOCK(VK_FORMAT_ASTC_8x8_UNORM_BLOCK, new int[]{8,8,1}, 16, "ASTC_8x8", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 64),
    ASTC_8x8_SRGB_BLOCK(VK_FORMAT_ASTC_8x8_SRGB_BLOCK, new int[]{8,8,1}, 16, "ASTC_8x8", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 64),
    ASTC_10x5_UNORM_BLOCK(VK_FORMAT_ASTC_10x5_UNORM_BLOCK, new int[]{10,5,1}, 16, "ASTC_10x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 50),
    ASTC_10x5_SRGB_BLOCK(VK_FORMAT_ASTC_10x5_SRGB_BLOCK, new int[]{10,5,1}, 16, "ASTC_10x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 50),
    ASTC_10x6_UNORM_BLOCK(VK_FORMAT_ASTC_10x6_UNORM_BLOCK, new int[]{10,6,1}, 16, "ASTC_10x6", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 60),
    ASTC_10x6_SRGB_BLOCK(VK_FORMAT_ASTC_10x6_SRGB_BLOCK, new int[]{10,6,1}, 16, "ASTC_10x6", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 60),
    ASTC_10x8_UNORM_BLOCK(VK_FORMAT_ASTC_10x8_UNORM_BLOCK, new int[]{10,8,1}, 16, "ASTC_10x8", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 80),
    ASTC_10x8_SRGB_BLOCK(VK_FORMAT_ASTC_10x8_SRGB_BLOCK, new int[]{10,8,1}, 16, "ASTC_10x8", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 80),
    ASTC_10x10_UNORM_BLOCK(VK_FORMAT_ASTC_10x10_UNORM_BLOCK, new int[]{10,10,1}, 16, "ASTC_10x10", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 100),
    ASTC_10x10_SRGB_BLOCK(VK_FORMAT_ASTC_10x10_SRGB_BLOCK, new int[]{10,10,1}, 16, "ASTC_10x10", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 100),
    ASTC_12x10_UNORM_BLOCK(VK_FORMAT_ASTC_12x10_UNORM_BLOCK, new int[]{12,10,1}, 16, "ASTC_12x10", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 120),
    ASTC_12x10_SRGB_BLOCK(VK_FORMAT_ASTC_12x10_SRGB_BLOCK, new int[]{12,10,1}, 16, "ASTC_12x10", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 120),
    ASTC_12x12_UNORM_BLOCK(VK_FORMAT_ASTC_12x12_UNORM_BLOCK, new int[]{12,12,1}, 16, "ASTC_12x12", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 144),
    ASTC_12x12_SRGB_BLOCK(VK_FORMAT_ASTC_12x12_SRGB_BLOCK, new int[]{12,12,1}, 16, "ASTC_12x12", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "ASTC LDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 144),
    G8B8G8R8_422_UNORM(VK_FORMAT_G8B8G8R8_422_UNORM, new int[]{2,1,1}, 4, "32-bit G8B8G8R8", new int[]{8, 8, 8, 8}, 4, new String[]{"G", "B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B8G8R8G8_422_UNORM(VK_FORMAT_B8G8R8G8_422_UNORM, new int[]{2,1,1}, 4, "32-bit B8G8R8G8", new int[]{8, 8, 8, 8}, 4, new String[]{"B", "G", "R", "G"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    G8_B8_R8_3PLANE_420_UNORM(VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM, new int[]{1,1,1}, 3, "8-bit 3-plane 420", new int[]{8, 8, 8}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 0, 3, new int[]{1, 2, 2}, new int[]{1, 2, 2}, 1),
    G8_B8R8_2PLANE_420_UNORM(VK_FORMAT_G8_B8R8_2PLANE_420_UNORM, new int[]{1,1,1}, 3, "8-bit 2-plane 420", new int[]{8, 8, 8}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 0, 2, new int[]{1, 2}, new int[]{1, 2}, 1),
    G8_B8_R8_3PLANE_422_UNORM(VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM, new int[]{1,1,1}, 3, "8-bit 3-plane 422", new int[]{8, 8, 8}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 0, 3, new int[]{1, 1, 1}, new int[]{1, 2, 2}, 1),
    G8_B8R8_2PLANE_422_UNORM(VK_FORMAT_G8_B8R8_2PLANE_422_UNORM, new int[]{1,1,1}, 3, "8-bit 2-plane 422", new int[]{8, 8, 8}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 0, 2, new int[]{1, 1}, new int[]{1, 2}, 1),
    G8_B8_R8_3PLANE_444_UNORM(VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM, new int[]{1,1,1}, 3, "8-bit 3-plane 444", new int[]{8, 8, 8}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 0, 3, new int[]{1, 1, 1}, new int[]{1, 1, 1}, 1),
    R10X6_UNORM_PACK16(VK_FORMAT_R10X6_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{10}, 1, new String[]{"R"}, new String[]{"UNORM"}, null, false, null, false, false, false, false, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R10X6G10X6_UNORM_2PACK16(VK_FORMAT_R10X6G10X6_UNORM_2PACK16, new int[]{1,1,1}, 4, "32-bit", new int[]{10, 10}, 2, new String[]{"R", "G"}, new String[]{"UNORM", "UNORM"}, null, false, null, false, false, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R10X6G10X6B10X6A10X6_UNORM_4PACK16(VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16, new int[]{1,1,1}, 8, "64-bit R10G10B10A10", new int[]{10, 10, 10, 10}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    G10X6B10X6G10X6R10X6_422_UNORM_4PACK16(VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16, new int[]{2,1,1}, 8, "64-bit G10B10G10R10", new int[]{10, 10, 10, 10}, 4, new String[]{"G", "B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    B10X6G10X6R10X6G10X6_422_UNORM_4PACK16(VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16, new int[]{2,1,1}, 8, "64-bit B10G10R10G10", new int[]{10, 10, 10, 10}, 4, new String[]{"B", "G", "R", "G"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16(VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16, new int[]{1,1,1}, 6, "10-bit 3-plane 420", new int[]{10, 10, 10}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 16, 3, new int[]{1, 2, 2}, new int[]{1, 2, 2}, 1),
    G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16(VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16, new int[]{1,1,1}, 6, "10-bit 2-plane 420", new int[]{10, 10, 10}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 16, 2, new int[]{1, 2}, new int[]{1, 2}, 1),
    G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16(VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16, new int[]{1,1,1}, 6, "10-bit 3-plane 422", new int[]{10, 10, 10}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 16, 3, new int[]{1, 1, 1}, new int[]{1, 2, 2}, 1),
    G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16(VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16, new int[]{1,1,1}, 6, "10-bit 2-plane 422", new int[]{10, 10, 10}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 16, 2, new int[]{1, 1}, new int[]{1, 2}, 1),
    G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16(VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16, new int[]{1,1,1}, 6, "10-bit 3-plane 444", new int[]{10, 10, 10}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 16, 3, new int[]{1, 1, 1}, new int[]{1, 1, 1}, 1),
    R12X4_UNORM_PACK16(VK_FORMAT_R12X4_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{12}, 1, new String[]{"R"}, new String[]{"UNORM"}, null, false, null, false, false, false, false, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R12X4G12X4_UNORM_2PACK16(VK_FORMAT_R12X4G12X4_UNORM_2PACK16, new int[]{1,1,1}, 4, "32-bit", new int[]{12, 12}, 2, new String[]{"R", "G"}, new String[]{"UNORM", "UNORM"}, null, false, null, false, false, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R12X4G12X4B12X4A12X4_UNORM_4PACK16(VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16, new int[]{1,1,1}, 8, "64-bit R12G12B12A12", new int[]{12, 12, 12, 12}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    G12X4B12X4G12X4R12X4_422_UNORM_4PACK16(VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16, new int[]{2,1,1}, 8, "64-bit G12B12G12R12", new int[]{12, 12, 12, 12}, 4, new String[]{"G", "B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    B12X4G12X4R12X4G12X4_422_UNORM_4PACK16(VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16, new int[]{2,1,1}, 8, "64-bit B12G12R12G12", new int[]{12, 12, 12, 12}, 4, new String[]{"B", "G", "R", "G"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16(VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16, new int[]{1,1,1}, 6, "12-bit 3-plane 420", new int[]{12, 12, 12}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 16, 3, new int[]{1, 2, 2}, new int[]{1, 2, 2}, 1),
    G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16(VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16, new int[]{1,1,1}, 6, "12-bit 2-plane 420", new int[]{12, 12, 12}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 16, 2, new int[]{1, 2}, new int[]{1, 2}, 1),
    G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16(VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16, new int[]{1,1,1}, 6, "12-bit 3-plane 422", new int[]{12, 12, 12}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 16, 3, new int[]{1, 1, 1}, new int[]{1, 2, 2}, 1),
    G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16(VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16, new int[]{1,1,1}, 6, "12-bit 2-plane 422", new int[]{12, 12, 12}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 16, 2, new int[]{1, 1}, new int[]{1, 2}, 1),
    G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16(VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16, new int[]{1,1,1}, 6, "12-bit 3-plane 444", new int[]{12, 12, 12}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 16, 3, new int[]{1, 1, 1}, new int[]{1, 1, 1}, 1),
    G16B16G16R16_422_UNORM(VK_FORMAT_G16B16G16R16_422_UNORM, new int[]{2,1,1}, 8, "64-bit G16B16G16R16", new int[]{16, 16, 16, 16}, 4, new String[]{"G", "B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    B16G16R16G16_422_UNORM(VK_FORMAT_B16G16R16G16_422_UNORM, new int[]{2,1,1}, 8, "64-bit B16G16R16G16", new int[]{16, 16, 16, 16}, 4, new String[]{"B", "G", "R", "G"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, false, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    G16_B16_R16_3PLANE_420_UNORM(VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM, new int[]{1,1,1}, 6, "16-bit 3-plane 420", new int[]{16, 16, 16}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 0, 3, new int[]{1, 2, 2}, new int[]{1, 2, 2}, 1),
    G16_B16R16_2PLANE_420_UNORM(VK_FORMAT_G16_B16R16_2PLANE_420_UNORM, new int[]{1,1,1}, 6, "16-bit 2-plane 420", new int[]{16, 16, 16}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 0, 2, new int[]{1, 2}, new int[]{1, 2}, 1),
    G16_B16_R16_3PLANE_422_UNORM(VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM, new int[]{1,1,1}, 6, "16-bit 3-plane 422", new int[]{16, 16, 16}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 0, 3, new int[]{1, 1, 1}, new int[]{1, 2, 2}, 1),
    G16_B16R16_2PLANE_422_UNORM(VK_FORMAT_G16_B16R16_2PLANE_422_UNORM, new int[]{1,1,1}, 6, "16-bit 2-plane 422", new int[]{16, 16, 16}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 0, 2, new int[]{1, 1}, new int[]{1, 2}, 1),
    G16_B16_R16_3PLANE_444_UNORM(VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM, new int[]{1,1,1}, 6, "16-bit 3-plane 444", new int[]{16, 16, 16}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 2}, false, null, false, true, false, true, true, false, 0, 3, new int[]{1, 1, 1}, new int[]{1, 1, 1}, 1),
    PVRTC1_2BPP_UNORM_BLOCK_IMG(VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG, new int[]{8,4,1}, 8, "PVRTC1_2BPP", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "PVRTC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    PVRTC1_4BPP_UNORM_BLOCK_IMG(VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG, new int[]{4,4,1}, 8, "PVRTC1_4BPP", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "PVRTC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    PVRTC2_2BPP_UNORM_BLOCK_IMG(VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG, new int[]{8,4,1}, 8, "PVRTC2_2BPP", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "PVRTC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    PVRTC2_4BPP_UNORM_BLOCK_IMG(VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG, new int[]{4,4,1}, 8, "PVRTC2_4BPP", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, true, "PVRTC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    PVRTC1_2BPP_SRGB_BLOCK_IMG(VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG, new int[]{8,4,1}, 8, "PVRTC1_2BPP", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "PVRTC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    PVRTC1_4BPP_SRGB_BLOCK_IMG(VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG, new int[]{4,4,1}, 8, "PVRTC1_4BPP", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "PVRTC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    PVRTC2_2BPP_SRGB_BLOCK_IMG(VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG, new int[]{8,4,1}, 8, "PVRTC2_2BPP", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "PVRTC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    PVRTC2_4BPP_SRGB_BLOCK_IMG(VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG, new int[]{4,4,1}, 8, "PVRTC2_4BPP", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SRGB", "SRGB", "SRGB", "UNORM"}, null, true, "PVRTC", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    ASTC_4x4_SFLOAT_BLOCK(VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK, new int[]{4,4,1}, 16, "ASTC_4x4", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 16),
    ASTC_5x4_SFLOAT_BLOCK(VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK, new int[]{5,4,1}, 16, "ASTC_5x4", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 20),
    ASTC_5x5_SFLOAT_BLOCK(VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK, new int[]{5,5,1}, 16, "ASTC_5x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 25),
    ASTC_6x5_SFLOAT_BLOCK(VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK, new int[]{6,5,1}, 16, "ASTC_6x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 30),
    ASTC_6x6_SFLOAT_BLOCK(VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK, new int[]{6,6,1}, 16, "ASTC_6x6", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 36),
    ASTC_8x5_SFLOAT_BLOCK(VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK, new int[]{8,5,1}, 16, "ASTC_8x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 40),
    ASTC_8x6_SFLOAT_BLOCK(VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK, new int[]{8,6,1}, 16, "ASTC_8x6", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 48),
    ASTC_8x8_SFLOAT_BLOCK(VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK, new int[]{8,8,1}, 16, "ASTC_8x8", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 64),
    ASTC_10x5_SFLOAT_BLOCK(VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK, new int[]{10,5,1}, 16, "ASTC_10x5", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 50),
    ASTC_10x6_SFLOAT_BLOCK(VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK, new int[]{10,6,1}, 16, "ASTC_10x6", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 60),
    ASTC_10x8_SFLOAT_BLOCK(VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK, new int[]{10,8,1}, 16, "ASTC_10x8", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 80),
    ASTC_10x10_SFLOAT_BLOCK(VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK, new int[]{10,10,1}, 16, "ASTC_10x10", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 100),
    ASTC_12x10_SFLOAT_BLOCK(VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK, new int[]{12,10,1}, 16, "ASTC_12x10", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 120),
    ASTC_12x12_SFLOAT_BLOCK(VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK, new int[]{12,12,1}, 16, "ASTC_12x12", null, 4, new String[]{"R", "G", "B", "A"}, new String[]{"SFLOAT", "SFLOAT", "SFLOAT", "SFLOAT"}, null, true, "ASTC HDR", true, true, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 144),
    G8_B8R8_2PLANE_444_UNORM(VK_FORMAT_G8_B8R8_2PLANE_444_UNORM, new int[]{1,1,1}, 3, "8-bit 2-plane 444", new int[]{8, 8, 8}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 0, 2, new int[]{1, 1}, new int[]{1, 1}, 1),
    G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16(VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16, new int[]{1,1,1}, 6, "10-bit 2-plane 444", new int[]{10, 10, 10}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 16, 2, new int[]{1, 1}, new int[]{1, 1}, 1),
    G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16(VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16, new int[]{1,1,1}, 6, "12-bit 2-plane 444", new int[]{12, 12, 12}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 16, 2, new int[]{1, 1}, new int[]{1, 1}, 1),
    G16_B16R16_2PLANE_444_UNORM(VK_FORMAT_G16_B16R16_2PLANE_444_UNORM, new int[]{1,1,1}, 6, "16-bit 2-plane 444", new int[]{16, 16, 16}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 0, 2, new int[]{1, 1}, new int[]{1, 1}, 1),
    A4R4G4B4_UNORM_PACK16(VK_FORMAT_A4R4G4B4_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{4, 4, 4, 4}, 4, new String[]{"A", "R", "G", "B"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    A4B4G4R4_UNORM_PACK16(VK_FORMAT_A4B4G4R4_UNORM_PACK16, new int[]{1,1,1}, 2, "16-bit", new int[]{4, 4, 4, 4}, 4, new String[]{"A", "B", "G", "R"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R16G16_SFIXED5_NV(VK_FORMAT_R16G16_SFIXED5_NV, new int[]{1,1,1}, 4, "32-bit", new int[]{16, 16}, 2, new String[]{"R", "G"}, new String[]{"SFIXED5", "SFIXED5"}, null, false, null, false, false, false, true, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    R10X6_UINT_PACK16_ARM(VK_FORMAT_R10X6_UINT_PACK16_ARM, new int[]{1,1,1}, 2, "16-bit", new int[]{10}, 1, new String[]{"R"}, new String[]{"UINT"}, null, false, null, false, false, false, false, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R10X6G10X6_UINT_2PACK16_ARM(VK_FORMAT_R10X6G10X6_UINT_2PACK16_ARM, new int[]{1,1,1}, 4, "32-bit", new int[]{10, 10}, 2, new String[]{"R", "G"}, new String[]{"UINT", "UINT"}, null, false, null, false, false, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R10X6G10X6B10X6A10X6_UINT_4PACK16_ARM(VK_FORMAT_R10X6G10X6B10X6A10X6_UINT_4PACK16_ARM, new int[]{1,1,1}, 8, "64-bit R10G10B10A10", new int[]{10, 10, 10, 10}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R12X4_UINT_PACK16_ARM(VK_FORMAT_R12X4_UINT_PACK16_ARM, new int[]{1,1,1}, 2, "16-bit", new int[]{12}, 1, new String[]{"R"}, new String[]{"UINT"}, null, false, null, false, false, false, false, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R12X4G12X4_UINT_2PACK16_ARM(VK_FORMAT_R12X4G12X4_UINT_2PACK16_ARM, new int[]{1,1,1}, 4, "32-bit", new int[]{12, 12}, 2, new String[]{"R", "G"}, new String[]{"UINT", "UINT"}, null, false, null, false, false, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R12X4G12X4B12X4A12X4_UINT_4PACK16_ARM(VK_FORMAT_R12X4G12X4B12X4A12X4_UINT_4PACK16_ARM, new int[]{1,1,1}, 8, "64-bit R12G12B12A12", new int[]{12, 12, 12, 12}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R14X2_UINT_PACK16_ARM(VK_FORMAT_R14X2_UINT_PACK16_ARM, new int[]{1,1,1}, 2, "16-bit", new int[]{14}, 1, new String[]{"R"}, new String[]{"UINT"}, null, false, null, false, false, false, false, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R14X2G14X2_UINT_2PACK16_ARM(VK_FORMAT_R14X2G14X2_UINT_2PACK16_ARM, new int[]{1,1,1}, 4, "32-bit", new int[]{14, 14}, 2, new String[]{"R", "G"}, new String[]{"UINT", "UINT"}, null, false, null, false, false, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R14X2G14X2B14X2A14X2_UINT_4PACK16_ARM(VK_FORMAT_R14X2G14X2B14X2A14X2_UINT_4PACK16_ARM, new int[]{1,1,1}, 8, "64-bit R14G14B14A14", new int[]{14, 14, 14, 14}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UINT", "UINT", "UINT", "UINT"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R14X2_UNORM_PACK16_ARM(VK_FORMAT_R14X2_UNORM_PACK16_ARM, new int[]{1,1,1}, 2, "16-bit", new int[]{14}, 1, new String[]{"R"}, new String[]{"UNORM"}, null, false, null, false, false, false, false, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R14X2G14X2_UNORM_2PACK16_ARM(VK_FORMAT_R14X2G14X2_UNORM_2PACK16_ARM, new int[]{1,1,1}, 4, "32-bit", new int[]{14, 14}, 2, new String[]{"R", "G"}, new String[]{"UNORM", "UNORM"}, null, false, null, false, false, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    R14X2G14X2B14X2A14X2_UNORM_4PACK16_ARM(VK_FORMAT_R14X2G14X2B14X2A14X2_UNORM_4PACK16_ARM, new int[]{1,1,1}, 8, "64-bit R14G14B14A14", new int[]{14, 14, 14, 14}, 4, new String[]{"R", "G", "B", "A"}, new String[]{"UNORM", "UNORM", "UNORM", "UNORM"}, null, false, null, true, true, false, true, true, false, 16, 1, new int[]{1}, new int[]{1}, 1),
    G14X2_B14X2R14X2_2PLANE_420_UNORM_3PACK16_ARM(VK_FORMAT_G14X2_B14X2R14X2_2PLANE_420_UNORM_3PACK16_ARM, new int[]{1,1,1}, 6, "14-bit 2-plane 420", new int[]{14, 14, 14}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 16, 2, new int[]{1, 2}, new int[]{1, 2}, 1),
    G14X2_B14X2R14X2_2PLANE_422_UNORM_3PACK16_ARM(VK_FORMAT_G14X2_B14X2R14X2_2PLANE_422_UNORM_3PACK16_ARM, new int[]{1,1,1}, 6, "14-bit 2-plane 422", new int[]{14, 14, 14}, 3, new String[]{"G", "B", "R"}, new String[]{"UNORM", "UNORM", "UNORM"}, new int[]{0, 1, 1}, false, null, false, true, false, true, true, false, 16, 2, new int[]{1, 1}, new int[]{1, 2}, 1),
    R8_BOOL_ARM(VK_FORMAT_R8_BOOL_ARM, new int[]{1,1,1}, 1, "8-bit", new int[]{8}, 1, new String[]{"R"}, new String[]{"BOOL"}, null, false, null, false, false, false, false, true, false, 0, 1, new int[]{1}, new int[]{1}, 1),
    ;
    private final int value;
    private final int[] blockExtent;
    private final int blockSize;
    private final String compatibilityClass;
    private final int[] componentBits;
    private final int componentCount;
    private final String[] componentName;
    private final String[] componentNumericFormat;
    private final int[] componentPlaneIndex;
    private final boolean componentsAreCompressed;
    private final String compressionScheme;
    private final boolean hasAlphaComponent;
    private final boolean hasBlueComponent;
    private final boolean hasDepthComponent;
    private final boolean hasGreenComponent;
    private final boolean hasRedComponent;
    private final boolean hasStencilComponent;
    private final int packed;
    private final int planeCount;
    private final int[] planeHeightDivisor;
    private final int[] planeWidthDivisor;
    private final int texelsPerBlock;
    VkFormat(
        int value,
        int[] blockExtent,
        int blockSize,
        String compatibilityClass,
        int[] componentBits,
        int componentCount,
        String[] componentName,
        String[] componentNumericFormat,
        int[] componentPlaneIndex,
        boolean componentsAreCompressed,
        String compressionScheme,
        boolean hasAlphaComponent,
        boolean hasBlueComponent,
        boolean hasDepthComponent,
        boolean hasGreenComponent,
        boolean hasRedComponent,
        boolean hasStencilComponent,
        int packed,
        int planeCount,
        int[] planeHeightDivisor,
        int[] planeWidthDivisor,
        int texelsPerBlock
    ) {
        this.value = value;
        this.blockExtent = blockExtent;
        this.blockSize = blockSize;
        this.compatibilityClass = compatibilityClass;
        this.componentBits = componentBits;
        this.componentCount = componentCount;
        this.componentName = componentName;
        this.componentNumericFormat = componentNumericFormat;
        this.componentPlaneIndex = componentPlaneIndex;
        this.componentsAreCompressed = componentsAreCompressed;
        this.compressionScheme = compressionScheme;
        this.hasAlphaComponent = hasAlphaComponent;
        this.hasBlueComponent = hasBlueComponent;
        this.hasDepthComponent = hasDepthComponent;
        this.hasGreenComponent = hasGreenComponent;
        this.hasRedComponent = hasRedComponent;
        this.hasStencilComponent = hasStencilComponent;
        this.packed = packed;
        this.planeCount = planeCount;
        this.planeHeightDivisor = planeHeightDivisor;
        this.planeWidthDivisor = planeWidthDivisor;
        this.texelsPerBlock = texelsPerBlock;
    }

    /// {@return the Vulkan enum value}
    public int value() { return value; };
    /// Gets [VkFormat] from the given enum value.
    /// @param value the enum value of the format
    /// @return the [VkFormat]
    public static VkFormat fromValue(int value) { return switch (value) {
        case VK_FORMAT_UNDEFINED -> UNDEFINED;
        case VK_FORMAT_R4G4_UNORM_PACK8 -> R4G4_UNORM_PACK8;
        case VK_FORMAT_R4G4B4A4_UNORM_PACK16 -> R4G4B4A4_UNORM_PACK16;
        case VK_FORMAT_B4G4R4A4_UNORM_PACK16 -> B4G4R4A4_UNORM_PACK16;
        case VK_FORMAT_R5G6B5_UNORM_PACK16 -> R5G6B5_UNORM_PACK16;
        case VK_FORMAT_B5G6R5_UNORM_PACK16 -> B5G6R5_UNORM_PACK16;
        case VK_FORMAT_R5G5B5A1_UNORM_PACK16 -> R5G5B5A1_UNORM_PACK16;
        case VK_FORMAT_B5G5R5A1_UNORM_PACK16 -> B5G5R5A1_UNORM_PACK16;
        case VK_FORMAT_A1R5G5B5_UNORM_PACK16 -> A1R5G5B5_UNORM_PACK16;
        case VK_FORMAT_A1B5G5R5_UNORM_PACK16 -> A1B5G5R5_UNORM_PACK16;
        case VK_FORMAT_A8_UNORM -> A8_UNORM;
        case VK_FORMAT_R8_UNORM -> R8_UNORM;
        case VK_FORMAT_R8_SNORM -> R8_SNORM;
        case VK_FORMAT_R8_USCALED -> R8_USCALED;
        case VK_FORMAT_R8_SSCALED -> R8_SSCALED;
        case VK_FORMAT_R8_UINT -> R8_UINT;
        case VK_FORMAT_R8_SINT -> R8_SINT;
        case VK_FORMAT_R8_SRGB -> R8_SRGB;
        case VK_FORMAT_R8G8_UNORM -> R8G8_UNORM;
        case VK_FORMAT_R8G8_SNORM -> R8G8_SNORM;
        case VK_FORMAT_R8G8_USCALED -> R8G8_USCALED;
        case VK_FORMAT_R8G8_SSCALED -> R8G8_SSCALED;
        case VK_FORMAT_R8G8_UINT -> R8G8_UINT;
        case VK_FORMAT_R8G8_SINT -> R8G8_SINT;
        case VK_FORMAT_R8G8_SRGB -> R8G8_SRGB;
        case VK_FORMAT_R8G8B8_UNORM -> R8G8B8_UNORM;
        case VK_FORMAT_R8G8B8_SNORM -> R8G8B8_SNORM;
        case VK_FORMAT_R8G8B8_USCALED -> R8G8B8_USCALED;
        case VK_FORMAT_R8G8B8_SSCALED -> R8G8B8_SSCALED;
        case VK_FORMAT_R8G8B8_UINT -> R8G8B8_UINT;
        case VK_FORMAT_R8G8B8_SINT -> R8G8B8_SINT;
        case VK_FORMAT_R8G8B8_SRGB -> R8G8B8_SRGB;
        case VK_FORMAT_B8G8R8_UNORM -> B8G8R8_UNORM;
        case VK_FORMAT_B8G8R8_SNORM -> B8G8R8_SNORM;
        case VK_FORMAT_B8G8R8_USCALED -> B8G8R8_USCALED;
        case VK_FORMAT_B8G8R8_SSCALED -> B8G8R8_SSCALED;
        case VK_FORMAT_B8G8R8_UINT -> B8G8R8_UINT;
        case VK_FORMAT_B8G8R8_SINT -> B8G8R8_SINT;
        case VK_FORMAT_B8G8R8_SRGB -> B8G8R8_SRGB;
        case VK_FORMAT_R8G8B8A8_UNORM -> R8G8B8A8_UNORM;
        case VK_FORMAT_R8G8B8A8_SNORM -> R8G8B8A8_SNORM;
        case VK_FORMAT_R8G8B8A8_USCALED -> R8G8B8A8_USCALED;
        case VK_FORMAT_R8G8B8A8_SSCALED -> R8G8B8A8_SSCALED;
        case VK_FORMAT_R8G8B8A8_UINT -> R8G8B8A8_UINT;
        case VK_FORMAT_R8G8B8A8_SINT -> R8G8B8A8_SINT;
        case VK_FORMAT_R8G8B8A8_SRGB -> R8G8B8A8_SRGB;
        case VK_FORMAT_B8G8R8A8_UNORM -> B8G8R8A8_UNORM;
        case VK_FORMAT_B8G8R8A8_SNORM -> B8G8R8A8_SNORM;
        case VK_FORMAT_B8G8R8A8_USCALED -> B8G8R8A8_USCALED;
        case VK_FORMAT_B8G8R8A8_SSCALED -> B8G8R8A8_SSCALED;
        case VK_FORMAT_B8G8R8A8_UINT -> B8G8R8A8_UINT;
        case VK_FORMAT_B8G8R8A8_SINT -> B8G8R8A8_SINT;
        case VK_FORMAT_B8G8R8A8_SRGB -> B8G8R8A8_SRGB;
        case VK_FORMAT_A8B8G8R8_UNORM_PACK32 -> A8B8G8R8_UNORM_PACK32;
        case VK_FORMAT_A8B8G8R8_SNORM_PACK32 -> A8B8G8R8_SNORM_PACK32;
        case VK_FORMAT_A8B8G8R8_USCALED_PACK32 -> A8B8G8R8_USCALED_PACK32;
        case VK_FORMAT_A8B8G8R8_SSCALED_PACK32 -> A8B8G8R8_SSCALED_PACK32;
        case VK_FORMAT_A8B8G8R8_UINT_PACK32 -> A8B8G8R8_UINT_PACK32;
        case VK_FORMAT_A8B8G8R8_SINT_PACK32 -> A8B8G8R8_SINT_PACK32;
        case VK_FORMAT_A8B8G8R8_SRGB_PACK32 -> A8B8G8R8_SRGB_PACK32;
        case VK_FORMAT_A2R10G10B10_UNORM_PACK32 -> A2R10G10B10_UNORM_PACK32;
        case VK_FORMAT_A2R10G10B10_SNORM_PACK32 -> A2R10G10B10_SNORM_PACK32;
        case VK_FORMAT_A2R10G10B10_USCALED_PACK32 -> A2R10G10B10_USCALED_PACK32;
        case VK_FORMAT_A2R10G10B10_SSCALED_PACK32 -> A2R10G10B10_SSCALED_PACK32;
        case VK_FORMAT_A2R10G10B10_UINT_PACK32 -> A2R10G10B10_UINT_PACK32;
        case VK_FORMAT_A2R10G10B10_SINT_PACK32 -> A2R10G10B10_SINT_PACK32;
        case VK_FORMAT_A2B10G10R10_UNORM_PACK32 -> A2B10G10R10_UNORM_PACK32;
        case VK_FORMAT_A2B10G10R10_SNORM_PACK32 -> A2B10G10R10_SNORM_PACK32;
        case VK_FORMAT_A2B10G10R10_USCALED_PACK32 -> A2B10G10R10_USCALED_PACK32;
        case VK_FORMAT_A2B10G10R10_SSCALED_PACK32 -> A2B10G10R10_SSCALED_PACK32;
        case VK_FORMAT_A2B10G10R10_UINT_PACK32 -> A2B10G10R10_UINT_PACK32;
        case VK_FORMAT_A2B10G10R10_SINT_PACK32 -> A2B10G10R10_SINT_PACK32;
        case VK_FORMAT_R16_UNORM -> R16_UNORM;
        case VK_FORMAT_R16_SNORM -> R16_SNORM;
        case VK_FORMAT_R16_USCALED -> R16_USCALED;
        case VK_FORMAT_R16_SSCALED -> R16_SSCALED;
        case VK_FORMAT_R16_UINT -> R16_UINT;
        case VK_FORMAT_R16_SINT -> R16_SINT;
        case VK_FORMAT_R16_SFLOAT -> R16_SFLOAT;
        case VK_FORMAT_R16G16_UNORM -> R16G16_UNORM;
        case VK_FORMAT_R16G16_SNORM -> R16G16_SNORM;
        case VK_FORMAT_R16G16_USCALED -> R16G16_USCALED;
        case VK_FORMAT_R16G16_SSCALED -> R16G16_SSCALED;
        case VK_FORMAT_R16G16_UINT -> R16G16_UINT;
        case VK_FORMAT_R16G16_SINT -> R16G16_SINT;
        case VK_FORMAT_R16G16_SFLOAT -> R16G16_SFLOAT;
        case VK_FORMAT_R16G16B16_UNORM -> R16G16B16_UNORM;
        case VK_FORMAT_R16G16B16_SNORM -> R16G16B16_SNORM;
        case VK_FORMAT_R16G16B16_USCALED -> R16G16B16_USCALED;
        case VK_FORMAT_R16G16B16_SSCALED -> R16G16B16_SSCALED;
        case VK_FORMAT_R16G16B16_UINT -> R16G16B16_UINT;
        case VK_FORMAT_R16G16B16_SINT -> R16G16B16_SINT;
        case VK_FORMAT_R16G16B16_SFLOAT -> R16G16B16_SFLOAT;
        case VK_FORMAT_R16G16B16A16_UNORM -> R16G16B16A16_UNORM;
        case VK_FORMAT_R16G16B16A16_SNORM -> R16G16B16A16_SNORM;
        case VK_FORMAT_R16G16B16A16_USCALED -> R16G16B16A16_USCALED;
        case VK_FORMAT_R16G16B16A16_SSCALED -> R16G16B16A16_SSCALED;
        case VK_FORMAT_R16G16B16A16_UINT -> R16G16B16A16_UINT;
        case VK_FORMAT_R16G16B16A16_SINT -> R16G16B16A16_SINT;
        case VK_FORMAT_R16G16B16A16_SFLOAT -> R16G16B16A16_SFLOAT;
        case VK_FORMAT_R32_UINT -> R32_UINT;
        case VK_FORMAT_R32_SINT -> R32_SINT;
        case VK_FORMAT_R32_SFLOAT -> R32_SFLOAT;
        case VK_FORMAT_R32G32_UINT -> R32G32_UINT;
        case VK_FORMAT_R32G32_SINT -> R32G32_SINT;
        case VK_FORMAT_R32G32_SFLOAT -> R32G32_SFLOAT;
        case VK_FORMAT_R32G32B32_UINT -> R32G32B32_UINT;
        case VK_FORMAT_R32G32B32_SINT -> R32G32B32_SINT;
        case VK_FORMAT_R32G32B32_SFLOAT -> R32G32B32_SFLOAT;
        case VK_FORMAT_R32G32B32A32_UINT -> R32G32B32A32_UINT;
        case VK_FORMAT_R32G32B32A32_SINT -> R32G32B32A32_SINT;
        case VK_FORMAT_R32G32B32A32_SFLOAT -> R32G32B32A32_SFLOAT;
        case VK_FORMAT_R64_UINT -> R64_UINT;
        case VK_FORMAT_R64_SINT -> R64_SINT;
        case VK_FORMAT_R64_SFLOAT -> R64_SFLOAT;
        case VK_FORMAT_R64G64_UINT -> R64G64_UINT;
        case VK_FORMAT_R64G64_SINT -> R64G64_SINT;
        case VK_FORMAT_R64G64_SFLOAT -> R64G64_SFLOAT;
        case VK_FORMAT_R64G64B64_UINT -> R64G64B64_UINT;
        case VK_FORMAT_R64G64B64_SINT -> R64G64B64_SINT;
        case VK_FORMAT_R64G64B64_SFLOAT -> R64G64B64_SFLOAT;
        case VK_FORMAT_R64G64B64A64_UINT -> R64G64B64A64_UINT;
        case VK_FORMAT_R64G64B64A64_SINT -> R64G64B64A64_SINT;
        case VK_FORMAT_R64G64B64A64_SFLOAT -> R64G64B64A64_SFLOAT;
        case VK_FORMAT_B10G11R11_UFLOAT_PACK32 -> B10G11R11_UFLOAT_PACK32;
        case VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 -> E5B9G9R9_UFLOAT_PACK32;
        case VK_FORMAT_D16_UNORM -> D16_UNORM;
        case VK_FORMAT_X8_D24_UNORM_PACK32 -> X8_D24_UNORM_PACK32;
        case VK_FORMAT_D32_SFLOAT -> D32_SFLOAT;
        case VK_FORMAT_S8_UINT -> S8_UINT;
        case VK_FORMAT_D16_UNORM_S8_UINT -> D16_UNORM_S8_UINT;
        case VK_FORMAT_D24_UNORM_S8_UINT -> D24_UNORM_S8_UINT;
        case VK_FORMAT_D32_SFLOAT_S8_UINT -> D32_SFLOAT_S8_UINT;
        case VK_FORMAT_BC1_RGB_UNORM_BLOCK -> BC1_RGB_UNORM_BLOCK;
        case VK_FORMAT_BC1_RGB_SRGB_BLOCK -> BC1_RGB_SRGB_BLOCK;
        case VK_FORMAT_BC1_RGBA_UNORM_BLOCK -> BC1_RGBA_UNORM_BLOCK;
        case VK_FORMAT_BC1_RGBA_SRGB_BLOCK -> BC1_RGBA_SRGB_BLOCK;
        case VK_FORMAT_BC2_UNORM_BLOCK -> BC2_UNORM_BLOCK;
        case VK_FORMAT_BC2_SRGB_BLOCK -> BC2_SRGB_BLOCK;
        case VK_FORMAT_BC3_UNORM_BLOCK -> BC3_UNORM_BLOCK;
        case VK_FORMAT_BC3_SRGB_BLOCK -> BC3_SRGB_BLOCK;
        case VK_FORMAT_BC4_UNORM_BLOCK -> BC4_UNORM_BLOCK;
        case VK_FORMAT_BC4_SNORM_BLOCK -> BC4_SNORM_BLOCK;
        case VK_FORMAT_BC5_UNORM_BLOCK -> BC5_UNORM_BLOCK;
        case VK_FORMAT_BC5_SNORM_BLOCK -> BC5_SNORM_BLOCK;
        case VK_FORMAT_BC6H_UFLOAT_BLOCK -> BC6H_UFLOAT_BLOCK;
        case VK_FORMAT_BC6H_SFLOAT_BLOCK -> BC6H_SFLOAT_BLOCK;
        case VK_FORMAT_BC7_UNORM_BLOCK -> BC7_UNORM_BLOCK;
        case VK_FORMAT_BC7_SRGB_BLOCK -> BC7_SRGB_BLOCK;
        case VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK -> ETC2_R8G8B8_UNORM_BLOCK;
        case VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK -> ETC2_R8G8B8_SRGB_BLOCK;
        case VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK -> ETC2_R8G8B8A1_UNORM_BLOCK;
        case VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK -> ETC2_R8G8B8A1_SRGB_BLOCK;
        case VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK -> ETC2_R8G8B8A8_UNORM_BLOCK;
        case VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK -> ETC2_R8G8B8A8_SRGB_BLOCK;
        case VK_FORMAT_EAC_R11_UNORM_BLOCK -> EAC_R11_UNORM_BLOCK;
        case VK_FORMAT_EAC_R11_SNORM_BLOCK -> EAC_R11_SNORM_BLOCK;
        case VK_FORMAT_EAC_R11G11_UNORM_BLOCK -> EAC_R11G11_UNORM_BLOCK;
        case VK_FORMAT_EAC_R11G11_SNORM_BLOCK -> EAC_R11G11_SNORM_BLOCK;
        case VK_FORMAT_ASTC_4x4_UNORM_BLOCK -> ASTC_4x4_UNORM_BLOCK;
        case VK_FORMAT_ASTC_4x4_SRGB_BLOCK -> ASTC_4x4_SRGB_BLOCK;
        case VK_FORMAT_ASTC_5x4_UNORM_BLOCK -> ASTC_5x4_UNORM_BLOCK;
        case VK_FORMAT_ASTC_5x4_SRGB_BLOCK -> ASTC_5x4_SRGB_BLOCK;
        case VK_FORMAT_ASTC_5x5_UNORM_BLOCK -> ASTC_5x5_UNORM_BLOCK;
        case VK_FORMAT_ASTC_5x5_SRGB_BLOCK -> ASTC_5x5_SRGB_BLOCK;
        case VK_FORMAT_ASTC_6x5_UNORM_BLOCK -> ASTC_6x5_UNORM_BLOCK;
        case VK_FORMAT_ASTC_6x5_SRGB_BLOCK -> ASTC_6x5_SRGB_BLOCK;
        case VK_FORMAT_ASTC_6x6_UNORM_BLOCK -> ASTC_6x6_UNORM_BLOCK;
        case VK_FORMAT_ASTC_6x6_SRGB_BLOCK -> ASTC_6x6_SRGB_BLOCK;
        case VK_FORMAT_ASTC_8x5_UNORM_BLOCK -> ASTC_8x5_UNORM_BLOCK;
        case VK_FORMAT_ASTC_8x5_SRGB_BLOCK -> ASTC_8x5_SRGB_BLOCK;
        case VK_FORMAT_ASTC_8x6_UNORM_BLOCK -> ASTC_8x6_UNORM_BLOCK;
        case VK_FORMAT_ASTC_8x6_SRGB_BLOCK -> ASTC_8x6_SRGB_BLOCK;
        case VK_FORMAT_ASTC_8x8_UNORM_BLOCK -> ASTC_8x8_UNORM_BLOCK;
        case VK_FORMAT_ASTC_8x8_SRGB_BLOCK -> ASTC_8x8_SRGB_BLOCK;
        case VK_FORMAT_ASTC_10x5_UNORM_BLOCK -> ASTC_10x5_UNORM_BLOCK;
        case VK_FORMAT_ASTC_10x5_SRGB_BLOCK -> ASTC_10x5_SRGB_BLOCK;
        case VK_FORMAT_ASTC_10x6_UNORM_BLOCK -> ASTC_10x6_UNORM_BLOCK;
        case VK_FORMAT_ASTC_10x6_SRGB_BLOCK -> ASTC_10x6_SRGB_BLOCK;
        case VK_FORMAT_ASTC_10x8_UNORM_BLOCK -> ASTC_10x8_UNORM_BLOCK;
        case VK_FORMAT_ASTC_10x8_SRGB_BLOCK -> ASTC_10x8_SRGB_BLOCK;
        case VK_FORMAT_ASTC_10x10_UNORM_BLOCK -> ASTC_10x10_UNORM_BLOCK;
        case VK_FORMAT_ASTC_10x10_SRGB_BLOCK -> ASTC_10x10_SRGB_BLOCK;
        case VK_FORMAT_ASTC_12x10_UNORM_BLOCK -> ASTC_12x10_UNORM_BLOCK;
        case VK_FORMAT_ASTC_12x10_SRGB_BLOCK -> ASTC_12x10_SRGB_BLOCK;
        case VK_FORMAT_ASTC_12x12_UNORM_BLOCK -> ASTC_12x12_UNORM_BLOCK;
        case VK_FORMAT_ASTC_12x12_SRGB_BLOCK -> ASTC_12x12_SRGB_BLOCK;
        case VK_FORMAT_G8B8G8R8_422_UNORM -> G8B8G8R8_422_UNORM;
        case VK_FORMAT_B8G8R8G8_422_UNORM -> B8G8R8G8_422_UNORM;
        case VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM -> G8_B8_R8_3PLANE_420_UNORM;
        case VK_FORMAT_G8_B8R8_2PLANE_420_UNORM -> G8_B8R8_2PLANE_420_UNORM;
        case VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM -> G8_B8_R8_3PLANE_422_UNORM;
        case VK_FORMAT_G8_B8R8_2PLANE_422_UNORM -> G8_B8R8_2PLANE_422_UNORM;
        case VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM -> G8_B8_R8_3PLANE_444_UNORM;
        case VK_FORMAT_R10X6_UNORM_PACK16 -> R10X6_UNORM_PACK16;
        case VK_FORMAT_R10X6G10X6_UNORM_2PACK16 -> R10X6G10X6_UNORM_2PACK16;
        case VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16 -> R10X6G10X6B10X6A10X6_UNORM_4PACK16;
        case VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 -> G10X6B10X6G10X6R10X6_422_UNORM_4PACK16;
        case VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 -> B10X6G10X6R10X6G10X6_422_UNORM_4PACK16;
        case VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 -> G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16;
        case VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 -> G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16;
        case VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 -> G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16;
        case VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 -> G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16;
        case VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 -> G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16;
        case VK_FORMAT_R12X4_UNORM_PACK16 -> R12X4_UNORM_PACK16;
        case VK_FORMAT_R12X4G12X4_UNORM_2PACK16 -> R12X4G12X4_UNORM_2PACK16;
        case VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16 -> R12X4G12X4B12X4A12X4_UNORM_4PACK16;
        case VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 -> G12X4B12X4G12X4R12X4_422_UNORM_4PACK16;
        case VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 -> B12X4G12X4R12X4G12X4_422_UNORM_4PACK16;
        case VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 -> G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16;
        case VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 -> G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16;
        case VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 -> G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16;
        case VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 -> G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16;
        case VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 -> G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16;
        case VK_FORMAT_G16B16G16R16_422_UNORM -> G16B16G16R16_422_UNORM;
        case VK_FORMAT_B16G16R16G16_422_UNORM -> B16G16R16G16_422_UNORM;
        case VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM -> G16_B16_R16_3PLANE_420_UNORM;
        case VK_FORMAT_G16_B16R16_2PLANE_420_UNORM -> G16_B16R16_2PLANE_420_UNORM;
        case VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM -> G16_B16_R16_3PLANE_422_UNORM;
        case VK_FORMAT_G16_B16R16_2PLANE_422_UNORM -> G16_B16R16_2PLANE_422_UNORM;
        case VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM -> G16_B16_R16_3PLANE_444_UNORM;
        case VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG -> PVRTC1_2BPP_UNORM_BLOCK_IMG;
        case VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG -> PVRTC1_4BPP_UNORM_BLOCK_IMG;
        case VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG -> PVRTC2_2BPP_UNORM_BLOCK_IMG;
        case VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG -> PVRTC2_4BPP_UNORM_BLOCK_IMG;
        case VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG -> PVRTC1_2BPP_SRGB_BLOCK_IMG;
        case VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG -> PVRTC1_4BPP_SRGB_BLOCK_IMG;
        case VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG -> PVRTC2_2BPP_SRGB_BLOCK_IMG;
        case VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG -> PVRTC2_4BPP_SRGB_BLOCK_IMG;
        case VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK -> ASTC_4x4_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK -> ASTC_5x4_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK -> ASTC_5x5_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK -> ASTC_6x5_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK -> ASTC_6x6_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK -> ASTC_8x5_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK -> ASTC_8x6_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK -> ASTC_8x8_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK -> ASTC_10x5_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK -> ASTC_10x6_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK -> ASTC_10x8_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK -> ASTC_10x10_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK -> ASTC_12x10_SFLOAT_BLOCK;
        case VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK -> ASTC_12x12_SFLOAT_BLOCK;
        case VK_FORMAT_G8_B8R8_2PLANE_444_UNORM -> G8_B8R8_2PLANE_444_UNORM;
        case VK_FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 -> G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16;
        case VK_FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 -> G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16;
        case VK_FORMAT_G16_B16R16_2PLANE_444_UNORM -> G16_B16R16_2PLANE_444_UNORM;
        case VK_FORMAT_A4R4G4B4_UNORM_PACK16 -> A4R4G4B4_UNORM_PACK16;
        case VK_FORMAT_A4B4G4R4_UNORM_PACK16 -> A4B4G4R4_UNORM_PACK16;
        case VK_FORMAT_R16G16_SFIXED5_NV -> R16G16_SFIXED5_NV;
        case VK_FORMAT_R10X6_UINT_PACK16_ARM -> R10X6_UINT_PACK16_ARM;
        case VK_FORMAT_R10X6G10X6_UINT_2PACK16_ARM -> R10X6G10X6_UINT_2PACK16_ARM;
        case VK_FORMAT_R10X6G10X6B10X6A10X6_UINT_4PACK16_ARM -> R10X6G10X6B10X6A10X6_UINT_4PACK16_ARM;
        case VK_FORMAT_R12X4_UINT_PACK16_ARM -> R12X4_UINT_PACK16_ARM;
        case VK_FORMAT_R12X4G12X4_UINT_2PACK16_ARM -> R12X4G12X4_UINT_2PACK16_ARM;
        case VK_FORMAT_R12X4G12X4B12X4A12X4_UINT_4PACK16_ARM -> R12X4G12X4B12X4A12X4_UINT_4PACK16_ARM;
        case VK_FORMAT_R14X2_UINT_PACK16_ARM -> R14X2_UINT_PACK16_ARM;
        case VK_FORMAT_R14X2G14X2_UINT_2PACK16_ARM -> R14X2G14X2_UINT_2PACK16_ARM;
        case VK_FORMAT_R14X2G14X2B14X2A14X2_UINT_4PACK16_ARM -> R14X2G14X2B14X2A14X2_UINT_4PACK16_ARM;
        case VK_FORMAT_R14X2_UNORM_PACK16_ARM -> R14X2_UNORM_PACK16_ARM;
        case VK_FORMAT_R14X2G14X2_UNORM_2PACK16_ARM -> R14X2G14X2_UNORM_2PACK16_ARM;
        case VK_FORMAT_R14X2G14X2B14X2A14X2_UNORM_4PACK16_ARM -> R14X2G14X2B14X2A14X2_UNORM_4PACK16_ARM;
        case VK_FORMAT_G14X2_B14X2R14X2_2PLANE_420_UNORM_3PACK16_ARM -> G14X2_B14X2R14X2_2PLANE_420_UNORM_3PACK16_ARM;
        case VK_FORMAT_G14X2_B14X2R14X2_2PLANE_422_UNORM_3PACK16_ARM -> G14X2_B14X2R14X2_2PLANE_422_UNORM_3PACK16_ARM;
        case VK_FORMAT_R8_BOOL_ARM -> R8_BOOL_ARM;
        default -> throw new IllegalArgumentException("Unexpected value: " + value); };
    }

    /// The three-dimensional extent of a texel block.
    public int[] blockExtent() { return blockExtent.clone(); };
    /// The texel block size in bytes.
    public int blockSize() { return blockSize; };
    /// The class of the format (can't be just named "class"!)
    public String compatibilityClass() { return compatibilityClass; };
    /// The number of bits in this component, if not compressed, otherwise 0.
    public int componentBits(int component) { if (componentsAreCompressed) return 0; return componentBits[component]; }
    /// The number of components of this format.
    public int componentCount() { return componentCount; }
    /// The name of the component
    public String componentName(int component) { return componentName[component]; }
    /// The numeric format of the component
    public String componentNumericFormat(int component) { return componentNumericFormat[component]; }
    /// The plane this component lies in.
    public int componentPlaneIndex(int component) { return componentPlaneIndex != null ? componentPlaneIndex[component] : 0; }
    /// True, if the components of this format are compressed, otherwise false.
    public boolean componentsAreCompressed() { return componentsAreCompressed; }
    /// A textual description of the compression scheme, or an empty string if it is not compressed
    public String compressionScheme() { return compressionScheme != null ? compressionScheme : ""; }

    private static final List<VkFormat> allFormats = List.of(
        R4G4_UNORM_PACK8,
        R4G4B4A4_UNORM_PACK16,
        B4G4R4A4_UNORM_PACK16,
        R5G6B5_UNORM_PACK16,
        B5G6R5_UNORM_PACK16,
        R5G5B5A1_UNORM_PACK16,
        B5G5R5A1_UNORM_PACK16,
        A1R5G5B5_UNORM_PACK16,
        A1B5G5R5_UNORM_PACK16,
        A8_UNORM,
        R8_UNORM,
        R8_SNORM,
        R8_USCALED,
        R8_SSCALED,
        R8_UINT,
        R8_SINT,
        R8_SRGB,
        R8G8_UNORM,
        R8G8_SNORM,
        R8G8_USCALED,
        R8G8_SSCALED,
        R8G8_UINT,
        R8G8_SINT,
        R8G8_SRGB,
        R8G8B8_UNORM,
        R8G8B8_SNORM,
        R8G8B8_USCALED,
        R8G8B8_SSCALED,
        R8G8B8_UINT,
        R8G8B8_SINT,
        R8G8B8_SRGB,
        B8G8R8_UNORM,
        B8G8R8_SNORM,
        B8G8R8_USCALED,
        B8G8R8_SSCALED,
        B8G8R8_UINT,
        B8G8R8_SINT,
        B8G8R8_SRGB,
        R8G8B8A8_UNORM,
        R8G8B8A8_SNORM,
        R8G8B8A8_USCALED,
        R8G8B8A8_SSCALED,
        R8G8B8A8_UINT,
        R8G8B8A8_SINT,
        R8G8B8A8_SRGB,
        B8G8R8A8_UNORM,
        B8G8R8A8_SNORM,
        B8G8R8A8_USCALED,
        B8G8R8A8_SSCALED,
        B8G8R8A8_UINT,
        B8G8R8A8_SINT,
        B8G8R8A8_SRGB,
        A8B8G8R8_UNORM_PACK32,
        A8B8G8R8_SNORM_PACK32,
        A8B8G8R8_USCALED_PACK32,
        A8B8G8R8_SSCALED_PACK32,
        A8B8G8R8_UINT_PACK32,
        A8B8G8R8_SINT_PACK32,
        A8B8G8R8_SRGB_PACK32,
        A2R10G10B10_UNORM_PACK32,
        A2R10G10B10_SNORM_PACK32,
        A2R10G10B10_USCALED_PACK32,
        A2R10G10B10_SSCALED_PACK32,
        A2R10G10B10_UINT_PACK32,
        A2R10G10B10_SINT_PACK32,
        A2B10G10R10_UNORM_PACK32,
        A2B10G10R10_SNORM_PACK32,
        A2B10G10R10_USCALED_PACK32,
        A2B10G10R10_SSCALED_PACK32,
        A2B10G10R10_UINT_PACK32,
        A2B10G10R10_SINT_PACK32,
        R16_UNORM,
        R16_SNORM,
        R16_USCALED,
        R16_SSCALED,
        R16_UINT,
        R16_SINT,
        R16_SFLOAT,
        R16G16_UNORM,
        R16G16_SNORM,
        R16G16_USCALED,
        R16G16_SSCALED,
        R16G16_UINT,
        R16G16_SINT,
        R16G16_SFLOAT,
        R16G16B16_UNORM,
        R16G16B16_SNORM,
        R16G16B16_USCALED,
        R16G16B16_SSCALED,
        R16G16B16_UINT,
        R16G16B16_SINT,
        R16G16B16_SFLOAT,
        R16G16B16A16_UNORM,
        R16G16B16A16_SNORM,
        R16G16B16A16_USCALED,
        R16G16B16A16_SSCALED,
        R16G16B16A16_UINT,
        R16G16B16A16_SINT,
        R16G16B16A16_SFLOAT,
        R32_UINT,
        R32_SINT,
        R32_SFLOAT,
        R32G32_UINT,
        R32G32_SINT,
        R32G32_SFLOAT,
        R32G32B32_UINT,
        R32G32B32_SINT,
        R32G32B32_SFLOAT,
        R32G32B32A32_UINT,
        R32G32B32A32_SINT,
        R32G32B32A32_SFLOAT,
        R64_UINT,
        R64_SINT,
        R64_SFLOAT,
        R64G64_UINT,
        R64G64_SINT,
        R64G64_SFLOAT,
        R64G64B64_UINT,
        R64G64B64_SINT,
        R64G64B64_SFLOAT,
        R64G64B64A64_UINT,
        R64G64B64A64_SINT,
        R64G64B64A64_SFLOAT,
        B10G11R11_UFLOAT_PACK32,
        E5B9G9R9_UFLOAT_PACK32,
        D16_UNORM,
        X8_D24_UNORM_PACK32,
        D32_SFLOAT,
        S8_UINT,
        D16_UNORM_S8_UINT,
        D24_UNORM_S8_UINT,
        D32_SFLOAT_S8_UINT,
        BC1_RGB_UNORM_BLOCK,
        BC1_RGB_SRGB_BLOCK,
        BC1_RGBA_UNORM_BLOCK,
        BC1_RGBA_SRGB_BLOCK,
        BC2_UNORM_BLOCK,
        BC2_SRGB_BLOCK,
        BC3_UNORM_BLOCK,
        BC3_SRGB_BLOCK,
        BC4_UNORM_BLOCK,
        BC4_SNORM_BLOCK,
        BC5_UNORM_BLOCK,
        BC5_SNORM_BLOCK,
        BC6H_UFLOAT_BLOCK,
        BC6H_SFLOAT_BLOCK,
        BC7_UNORM_BLOCK,
        BC7_SRGB_BLOCK,
        ETC2_R8G8B8_UNORM_BLOCK,
        ETC2_R8G8B8_SRGB_BLOCK,
        ETC2_R8G8B8A1_UNORM_BLOCK,
        ETC2_R8G8B8A1_SRGB_BLOCK,
        ETC2_R8G8B8A8_UNORM_BLOCK,
        ETC2_R8G8B8A8_SRGB_BLOCK,
        EAC_R11_UNORM_BLOCK,
        EAC_R11_SNORM_BLOCK,
        EAC_R11G11_UNORM_BLOCK,
        EAC_R11G11_SNORM_BLOCK,
        ASTC_4x4_UNORM_BLOCK,
        ASTC_4x4_SRGB_BLOCK,
        ASTC_5x4_UNORM_BLOCK,
        ASTC_5x4_SRGB_BLOCK,
        ASTC_5x5_UNORM_BLOCK,
        ASTC_5x5_SRGB_BLOCK,
        ASTC_6x5_UNORM_BLOCK,
        ASTC_6x5_SRGB_BLOCK,
        ASTC_6x6_UNORM_BLOCK,
        ASTC_6x6_SRGB_BLOCK,
        ASTC_8x5_UNORM_BLOCK,
        ASTC_8x5_SRGB_BLOCK,
        ASTC_8x6_UNORM_BLOCK,
        ASTC_8x6_SRGB_BLOCK,
        ASTC_8x8_UNORM_BLOCK,
        ASTC_8x8_SRGB_BLOCK,
        ASTC_10x5_UNORM_BLOCK,
        ASTC_10x5_SRGB_BLOCK,
        ASTC_10x6_UNORM_BLOCK,
        ASTC_10x6_SRGB_BLOCK,
        ASTC_10x8_UNORM_BLOCK,
        ASTC_10x8_SRGB_BLOCK,
        ASTC_10x10_UNORM_BLOCK,
        ASTC_10x10_SRGB_BLOCK,
        ASTC_12x10_UNORM_BLOCK,
        ASTC_12x10_SRGB_BLOCK,
        ASTC_12x12_UNORM_BLOCK,
        ASTC_12x12_SRGB_BLOCK,
        G8B8G8R8_422_UNORM,
        B8G8R8G8_422_UNORM,
        G8_B8_R8_3PLANE_420_UNORM,
        G8_B8R8_2PLANE_420_UNORM,
        G8_B8_R8_3PLANE_422_UNORM,
        G8_B8R8_2PLANE_422_UNORM,
        G8_B8_R8_3PLANE_444_UNORM,
        R10X6_UNORM_PACK16,
        R10X6G10X6_UNORM_2PACK16,
        R10X6G10X6B10X6A10X6_UNORM_4PACK16,
        G10X6B10X6G10X6R10X6_422_UNORM_4PACK16,
        B10X6G10X6R10X6G10X6_422_UNORM_4PACK16,
        G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16,
        G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16,
        G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16,
        G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16,
        G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16,
        R12X4_UNORM_PACK16,
        R12X4G12X4_UNORM_2PACK16,
        R12X4G12X4B12X4A12X4_UNORM_4PACK16,
        G12X4B12X4G12X4R12X4_422_UNORM_4PACK16,
        B12X4G12X4R12X4G12X4_422_UNORM_4PACK16,
        G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16,
        G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16,
        G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16,
        G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16,
        G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16,
        G16B16G16R16_422_UNORM,
        B16G16R16G16_422_UNORM,
        G16_B16_R16_3PLANE_420_UNORM,
        G16_B16R16_2PLANE_420_UNORM,
        G16_B16_R16_3PLANE_422_UNORM,
        G16_B16R16_2PLANE_422_UNORM,
        G16_B16_R16_3PLANE_444_UNORM,
        PVRTC1_2BPP_UNORM_BLOCK_IMG,
        PVRTC1_4BPP_UNORM_BLOCK_IMG,
        PVRTC2_2BPP_UNORM_BLOCK_IMG,
        PVRTC2_4BPP_UNORM_BLOCK_IMG,
        PVRTC1_2BPP_SRGB_BLOCK_IMG,
        PVRTC1_4BPP_SRGB_BLOCK_IMG,
        PVRTC2_2BPP_SRGB_BLOCK_IMG,
        PVRTC2_4BPP_SRGB_BLOCK_IMG,
        ASTC_4x4_SFLOAT_BLOCK,
        ASTC_5x4_SFLOAT_BLOCK,
        ASTC_5x5_SFLOAT_BLOCK,
        ASTC_6x5_SFLOAT_BLOCK,
        ASTC_6x6_SFLOAT_BLOCK,
        ASTC_8x5_SFLOAT_BLOCK,
        ASTC_8x6_SFLOAT_BLOCK,
        ASTC_8x8_SFLOAT_BLOCK,
        ASTC_10x5_SFLOAT_BLOCK,
        ASTC_10x6_SFLOAT_BLOCK,
        ASTC_10x8_SFLOAT_BLOCK,
        ASTC_10x10_SFLOAT_BLOCK,
        ASTC_12x10_SFLOAT_BLOCK,
        ASTC_12x12_SFLOAT_BLOCK,
        G8_B8R8_2PLANE_444_UNORM,
        G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16,
        G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16,
        G16_B16R16_2PLANE_444_UNORM,
        A4R4G4B4_UNORM_PACK16,
        A4B4G4R4_UNORM_PACK16,
        R16G16_SFIXED5_NV,
        R10X6_UINT_PACK16_ARM,
        R10X6G10X6_UINT_2PACK16_ARM,
        R10X6G10X6B10X6A10X6_UINT_4PACK16_ARM,
        R12X4_UINT_PACK16_ARM,
        R12X4G12X4_UINT_2PACK16_ARM,
        R12X4G12X4B12X4A12X4_UINT_4PACK16_ARM,
        R14X2_UINT_PACK16_ARM,
        R14X2G14X2_UINT_2PACK16_ARM,
        R14X2G14X2B14X2A14X2_UINT_4PACK16_ARM,
        R14X2_UNORM_PACK16_ARM,
        R14X2G14X2_UNORM_2PACK16_ARM,
        R14X2G14X2B14X2A14X2_UNORM_4PACK16_ARM,
        G14X2_B14X2R14X2_2PLANE_420_UNORM_3PACK16_ARM,
        G14X2_B14X2R14X2_2PLANE_422_UNORM_3PACK16_ARM,
        R8_BOOL_ARM
    );
    /// Get all formats
    public static List<VkFormat> getAllFormats() { return allFormats; }

    private static final List<VkFormat> colorFormats = List.of(
        R4G4_UNORM_PACK8,
        R4G4B4A4_UNORM_PACK16,
        B4G4R4A4_UNORM_PACK16,
        R5G6B5_UNORM_PACK16,
        B5G6R5_UNORM_PACK16,
        R5G5B5A1_UNORM_PACK16,
        B5G5R5A1_UNORM_PACK16,
        A1R5G5B5_UNORM_PACK16,
        A1B5G5R5_UNORM_PACK16,
        A8_UNORM,
        R8_UNORM,
        R8_SNORM,
        R8_USCALED,
        R8_SSCALED,
        R8_UINT,
        R8_SINT,
        R8_SRGB,
        R8G8_UNORM,
        R8G8_SNORM,
        R8G8_USCALED,
        R8G8_SSCALED,
        R8G8_UINT,
        R8G8_SINT,
        R8G8_SRGB,
        R8G8B8_UNORM,
        R8G8B8_SNORM,
        R8G8B8_USCALED,
        R8G8B8_SSCALED,
        R8G8B8_UINT,
        R8G8B8_SINT,
        R8G8B8_SRGB,
        B8G8R8_UNORM,
        B8G8R8_SNORM,
        B8G8R8_USCALED,
        B8G8R8_SSCALED,
        B8G8R8_UINT,
        B8G8R8_SINT,
        B8G8R8_SRGB,
        R8G8B8A8_UNORM,
        R8G8B8A8_SNORM,
        R8G8B8A8_USCALED,
        R8G8B8A8_SSCALED,
        R8G8B8A8_UINT,
        R8G8B8A8_SINT,
        R8G8B8A8_SRGB,
        B8G8R8A8_UNORM,
        B8G8R8A8_SNORM,
        B8G8R8A8_USCALED,
        B8G8R8A8_SSCALED,
        B8G8R8A8_UINT,
        B8G8R8A8_SINT,
        B8G8R8A8_SRGB,
        A8B8G8R8_UNORM_PACK32,
        A8B8G8R8_SNORM_PACK32,
        A8B8G8R8_USCALED_PACK32,
        A8B8G8R8_SSCALED_PACK32,
        A8B8G8R8_UINT_PACK32,
        A8B8G8R8_SINT_PACK32,
        A8B8G8R8_SRGB_PACK32,
        A2R10G10B10_UNORM_PACK32,
        A2R10G10B10_SNORM_PACK32,
        A2R10G10B10_USCALED_PACK32,
        A2R10G10B10_SSCALED_PACK32,
        A2R10G10B10_UINT_PACK32,
        A2R10G10B10_SINT_PACK32,
        A2B10G10R10_UNORM_PACK32,
        A2B10G10R10_SNORM_PACK32,
        A2B10G10R10_USCALED_PACK32,
        A2B10G10R10_SSCALED_PACK32,
        A2B10G10R10_UINT_PACK32,
        A2B10G10R10_SINT_PACK32,
        R16_UNORM,
        R16_SNORM,
        R16_USCALED,
        R16_SSCALED,
        R16_UINT,
        R16_SINT,
        R16_SFLOAT,
        R16G16_UNORM,
        R16G16_SNORM,
        R16G16_USCALED,
        R16G16_SSCALED,
        R16G16_UINT,
        R16G16_SINT,
        R16G16_SFLOAT,
        R16G16B16_UNORM,
        R16G16B16_SNORM,
        R16G16B16_USCALED,
        R16G16B16_SSCALED,
        R16G16B16_UINT,
        R16G16B16_SINT,
        R16G16B16_SFLOAT,
        R16G16B16A16_UNORM,
        R16G16B16A16_SNORM,
        R16G16B16A16_USCALED,
        R16G16B16A16_SSCALED,
        R16G16B16A16_UINT,
        R16G16B16A16_SINT,
        R16G16B16A16_SFLOAT,
        R32_UINT,
        R32_SINT,
        R32_SFLOAT,
        R32G32_UINT,
        R32G32_SINT,
        R32G32_SFLOAT,
        R32G32B32_UINT,
        R32G32B32_SINT,
        R32G32B32_SFLOAT,
        R32G32B32A32_UINT,
        R32G32B32A32_SINT,
        R32G32B32A32_SFLOAT,
        R64_UINT,
        R64_SINT,
        R64_SFLOAT,
        R64G64_UINT,
        R64G64_SINT,
        R64G64_SFLOAT,
        R64G64B64_UINT,
        R64G64B64_SINT,
        R64G64B64_SFLOAT,
        R64G64B64A64_UINT,
        R64G64B64A64_SINT,
        R64G64B64A64_SFLOAT,
        B10G11R11_UFLOAT_PACK32,
        E5B9G9R9_UFLOAT_PACK32,
        BC1_RGB_UNORM_BLOCK,
        BC1_RGB_SRGB_BLOCK,
        BC1_RGBA_UNORM_BLOCK,
        BC1_RGBA_SRGB_BLOCK,
        BC2_UNORM_BLOCK,
        BC2_SRGB_BLOCK,
        BC3_UNORM_BLOCK,
        BC3_SRGB_BLOCK,
        BC4_UNORM_BLOCK,
        BC4_SNORM_BLOCK,
        BC5_UNORM_BLOCK,
        BC5_SNORM_BLOCK,
        BC6H_UFLOAT_BLOCK,
        BC6H_SFLOAT_BLOCK,
        BC7_UNORM_BLOCK,
        BC7_SRGB_BLOCK,
        ETC2_R8G8B8_UNORM_BLOCK,
        ETC2_R8G8B8_SRGB_BLOCK,
        ETC2_R8G8B8A1_UNORM_BLOCK,
        ETC2_R8G8B8A1_SRGB_BLOCK,
        ETC2_R8G8B8A8_UNORM_BLOCK,
        ETC2_R8G8B8A8_SRGB_BLOCK,
        EAC_R11_UNORM_BLOCK,
        EAC_R11_SNORM_BLOCK,
        EAC_R11G11_UNORM_BLOCK,
        EAC_R11G11_SNORM_BLOCK,
        ASTC_4x4_UNORM_BLOCK,
        ASTC_4x4_SRGB_BLOCK,
        ASTC_5x4_UNORM_BLOCK,
        ASTC_5x4_SRGB_BLOCK,
        ASTC_5x5_UNORM_BLOCK,
        ASTC_5x5_SRGB_BLOCK,
        ASTC_6x5_UNORM_BLOCK,
        ASTC_6x5_SRGB_BLOCK,
        ASTC_6x6_UNORM_BLOCK,
        ASTC_6x6_SRGB_BLOCK,
        ASTC_8x5_UNORM_BLOCK,
        ASTC_8x5_SRGB_BLOCK,
        ASTC_8x6_UNORM_BLOCK,
        ASTC_8x6_SRGB_BLOCK,
        ASTC_8x8_UNORM_BLOCK,
        ASTC_8x8_SRGB_BLOCK,
        ASTC_10x5_UNORM_BLOCK,
        ASTC_10x5_SRGB_BLOCK,
        ASTC_10x6_UNORM_BLOCK,
        ASTC_10x6_SRGB_BLOCK,
        ASTC_10x8_UNORM_BLOCK,
        ASTC_10x8_SRGB_BLOCK,
        ASTC_10x10_UNORM_BLOCK,
        ASTC_10x10_SRGB_BLOCK,
        ASTC_12x10_UNORM_BLOCK,
        ASTC_12x10_SRGB_BLOCK,
        ASTC_12x12_UNORM_BLOCK,
        ASTC_12x12_SRGB_BLOCK,
        G8B8G8R8_422_UNORM,
        B8G8R8G8_422_UNORM,
        G8_B8_R8_3PLANE_420_UNORM,
        G8_B8R8_2PLANE_420_UNORM,
        G8_B8_R8_3PLANE_422_UNORM,
        G8_B8R8_2PLANE_422_UNORM,
        G8_B8_R8_3PLANE_444_UNORM,
        R10X6_UNORM_PACK16,
        R10X6G10X6_UNORM_2PACK16,
        R10X6G10X6B10X6A10X6_UNORM_4PACK16,
        G10X6B10X6G10X6R10X6_422_UNORM_4PACK16,
        B10X6G10X6R10X6G10X6_422_UNORM_4PACK16,
        G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16,
        G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16,
        G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16,
        G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16,
        G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16,
        R12X4_UNORM_PACK16,
        R12X4G12X4_UNORM_2PACK16,
        R12X4G12X4B12X4A12X4_UNORM_4PACK16,
        G12X4B12X4G12X4R12X4_422_UNORM_4PACK16,
        B12X4G12X4R12X4G12X4_422_UNORM_4PACK16,
        G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16,
        G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16,
        G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16,
        G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16,
        G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16,
        G16B16G16R16_422_UNORM,
        B16G16R16G16_422_UNORM,
        G16_B16_R16_3PLANE_420_UNORM,
        G16_B16R16_2PLANE_420_UNORM,
        G16_B16_R16_3PLANE_422_UNORM,
        G16_B16R16_2PLANE_422_UNORM,
        G16_B16_R16_3PLANE_444_UNORM,
        PVRTC1_2BPP_UNORM_BLOCK_IMG,
        PVRTC1_4BPP_UNORM_BLOCK_IMG,
        PVRTC2_2BPP_UNORM_BLOCK_IMG,
        PVRTC2_4BPP_UNORM_BLOCK_IMG,
        PVRTC1_2BPP_SRGB_BLOCK_IMG,
        PVRTC1_4BPP_SRGB_BLOCK_IMG,
        PVRTC2_2BPP_SRGB_BLOCK_IMG,
        PVRTC2_4BPP_SRGB_BLOCK_IMG,
        ASTC_4x4_SFLOAT_BLOCK,
        ASTC_5x4_SFLOAT_BLOCK,
        ASTC_5x5_SFLOAT_BLOCK,
        ASTC_6x5_SFLOAT_BLOCK,
        ASTC_6x6_SFLOAT_BLOCK,
        ASTC_8x5_SFLOAT_BLOCK,
        ASTC_8x6_SFLOAT_BLOCK,
        ASTC_8x8_SFLOAT_BLOCK,
        ASTC_10x5_SFLOAT_BLOCK,
        ASTC_10x6_SFLOAT_BLOCK,
        ASTC_10x8_SFLOAT_BLOCK,
        ASTC_10x10_SFLOAT_BLOCK,
        ASTC_12x10_SFLOAT_BLOCK,
        ASTC_12x12_SFLOAT_BLOCK,
        G8_B8R8_2PLANE_444_UNORM,
        G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16,
        G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16,
        G16_B16R16_2PLANE_444_UNORM,
        A4R4G4B4_UNORM_PACK16,
        A4B4G4R4_UNORM_PACK16,
        R16G16_SFIXED5_NV,
        R10X6_UINT_PACK16_ARM,
        R10X6G10X6_UINT_2PACK16_ARM,
        R10X6G10X6B10X6A10X6_UINT_4PACK16_ARM,
        R12X4_UINT_PACK16_ARM,
        R12X4G12X4_UINT_2PACK16_ARM,
        R12X4G12X4B12X4A12X4_UINT_4PACK16_ARM,
        R14X2_UINT_PACK16_ARM,
        R14X2G14X2_UINT_2PACK16_ARM,
        R14X2G14X2B14X2A14X2_UINT_4PACK16_ARM,
        R14X2_UNORM_PACK16_ARM,
        R14X2G14X2_UNORM_2PACK16_ARM,
        R14X2G14X2B14X2A14X2_UNORM_4PACK16_ARM,
        G14X2_B14X2R14X2_2PLANE_420_UNORM_3PACK16_ARM,
        G14X2_B14X2R14X2_2PLANE_422_UNORM_3PACK16_ARM,
        R8_BOOL_ARM
    );
    /// Get all formats with a color component
    public static List<VkFormat> getColorFormats() { return colorFormats; }

    private static final List<VkFormat> depthFormats = List.of(
        D16_UNORM,
        X8_D24_UNORM_PACK32,
        D32_SFLOAT,
        D16_UNORM_S8_UINT,
        D24_UNORM_S8_UINT,
        D32_SFLOAT_S8_UINT
    );
    /// Get all formats with a depth component
    public static List<VkFormat> getDepthFormats() { return depthFormats; }

    private static final List<VkFormat> depthStencilFormats = List.of(
        D16_UNORM_S8_UINT,
        D24_UNORM_S8_UINT,
        D32_SFLOAT_S8_UINT
    );
    /// Get all formats with a depth and a stencil component
    public static List<VkFormat> getDepthStencilFormats() { return depthStencilFormats; }

    private static final List<VkFormat> stencilFormats = List.of(
        S8_UINT,
        D16_UNORM_S8_UINT,
        D24_UNORM_S8_UINT,
        D32_SFLOAT_S8_UINT
    );
    /// Get all formats with a stencil component
    public static List<VkFormat> getStencilFormats() { return stencilFormats; }

    /// True, if this format has an alpha component
    public boolean hasAlphaComponent() { return hasAlphaComponent; }
    /// True, if this format has an blue component
    public boolean hasBlueComponent() { return hasBlueComponent; }
    /// True, if this format has an depth component
    public boolean hasDepthComponent() { return hasDepthComponent; }
    /// True, if this format has an green component
    public boolean hasGreenComponent() { return hasGreenComponent; }
    /// True, if this format has an red component
    public boolean hasRedComponent() { return hasRedComponent; }
    /// True, if this format has an stencil component
    public boolean hasStencilComponent() { return hasStencilComponent; }
    /// True, if this format is a color
    public boolean isColor() { return hasRedComponent || hasGreenComponent || hasBlueComponent || hasAlphaComponent; }
    /// True, if this format is a compressed one.
    public boolean isCompressed() { return compressionScheme != null; }
    /// The number of bits into which the format is packed.
    /// A single image element in this format can be stored in the same space as a scalar type of this bit width.
    public int packed() { return packed; }
    /// The single-plane format that this plane is compatible with.
    public VkFormat planeCompatibleFormat(int plane) { return switch (this) {
        case UNDEFINED -> this;
        case R4G4_UNORM_PACK8 -> this;
        case R4G4B4A4_UNORM_PACK16 -> this;
        case B4G4R4A4_UNORM_PACK16 -> this;
        case R5G6B5_UNORM_PACK16 -> this;
        case B5G6R5_UNORM_PACK16 -> this;
        case R5G5B5A1_UNORM_PACK16 -> this;
        case B5G5R5A1_UNORM_PACK16 -> this;
        case A1R5G5B5_UNORM_PACK16 -> this;
        case A1B5G5R5_UNORM_PACK16 -> this;
        case A8_UNORM -> this;
        case R8_UNORM -> this;
        case R8_SNORM -> this;
        case R8_USCALED -> this;
        case R8_SSCALED -> this;
        case R8_UINT -> this;
        case R8_SINT -> this;
        case R8_SRGB -> this;
        case R8G8_UNORM -> this;
        case R8G8_SNORM -> this;
        case R8G8_USCALED -> this;
        case R8G8_SSCALED -> this;
        case R8G8_UINT -> this;
        case R8G8_SINT -> this;
        case R8G8_SRGB -> this;
        case R8G8B8_UNORM -> this;
        case R8G8B8_SNORM -> this;
        case R8G8B8_USCALED -> this;
        case R8G8B8_SSCALED -> this;
        case R8G8B8_UINT -> this;
        case R8G8B8_SINT -> this;
        case R8G8B8_SRGB -> this;
        case B8G8R8_UNORM -> this;
        case B8G8R8_SNORM -> this;
        case B8G8R8_USCALED -> this;
        case B8G8R8_SSCALED -> this;
        case B8G8R8_UINT -> this;
        case B8G8R8_SINT -> this;
        case B8G8R8_SRGB -> this;
        case R8G8B8A8_UNORM -> this;
        case R8G8B8A8_SNORM -> this;
        case R8G8B8A8_USCALED -> this;
        case R8G8B8A8_SSCALED -> this;
        case R8G8B8A8_UINT -> this;
        case R8G8B8A8_SINT -> this;
        case R8G8B8A8_SRGB -> this;
        case B8G8R8A8_UNORM -> this;
        case B8G8R8A8_SNORM -> this;
        case B8G8R8A8_USCALED -> this;
        case B8G8R8A8_SSCALED -> this;
        case B8G8R8A8_UINT -> this;
        case B8G8R8A8_SINT -> this;
        case B8G8R8A8_SRGB -> this;
        case A8B8G8R8_UNORM_PACK32 -> this;
        case A8B8G8R8_SNORM_PACK32 -> this;
        case A8B8G8R8_USCALED_PACK32 -> this;
        case A8B8G8R8_SSCALED_PACK32 -> this;
        case A8B8G8R8_UINT_PACK32 -> this;
        case A8B8G8R8_SINT_PACK32 -> this;
        case A8B8G8R8_SRGB_PACK32 -> this;
        case A2R10G10B10_UNORM_PACK32 -> this;
        case A2R10G10B10_SNORM_PACK32 -> this;
        case A2R10G10B10_USCALED_PACK32 -> this;
        case A2R10G10B10_SSCALED_PACK32 -> this;
        case A2R10G10B10_UINT_PACK32 -> this;
        case A2R10G10B10_SINT_PACK32 -> this;
        case A2B10G10R10_UNORM_PACK32 -> this;
        case A2B10G10R10_SNORM_PACK32 -> this;
        case A2B10G10R10_USCALED_PACK32 -> this;
        case A2B10G10R10_SSCALED_PACK32 -> this;
        case A2B10G10R10_UINT_PACK32 -> this;
        case A2B10G10R10_SINT_PACK32 -> this;
        case R16_UNORM -> this;
        case R16_SNORM -> this;
        case R16_USCALED -> this;
        case R16_SSCALED -> this;
        case R16_UINT -> this;
        case R16_SINT -> this;
        case R16_SFLOAT -> this;
        case R16G16_UNORM -> this;
        case R16G16_SNORM -> this;
        case R16G16_USCALED -> this;
        case R16G16_SSCALED -> this;
        case R16G16_UINT -> this;
        case R16G16_SINT -> this;
        case R16G16_SFLOAT -> this;
        case R16G16B16_UNORM -> this;
        case R16G16B16_SNORM -> this;
        case R16G16B16_USCALED -> this;
        case R16G16B16_SSCALED -> this;
        case R16G16B16_UINT -> this;
        case R16G16B16_SINT -> this;
        case R16G16B16_SFLOAT -> this;
        case R16G16B16A16_UNORM -> this;
        case R16G16B16A16_SNORM -> this;
        case R16G16B16A16_USCALED -> this;
        case R16G16B16A16_SSCALED -> this;
        case R16G16B16A16_UINT -> this;
        case R16G16B16A16_SINT -> this;
        case R16G16B16A16_SFLOAT -> this;
        case R32_UINT -> this;
        case R32_SINT -> this;
        case R32_SFLOAT -> this;
        case R32G32_UINT -> this;
        case R32G32_SINT -> this;
        case R32G32_SFLOAT -> this;
        case R32G32B32_UINT -> this;
        case R32G32B32_SINT -> this;
        case R32G32B32_SFLOAT -> this;
        case R32G32B32A32_UINT -> this;
        case R32G32B32A32_SINT -> this;
        case R32G32B32A32_SFLOAT -> this;
        case R64_UINT -> this;
        case R64_SINT -> this;
        case R64_SFLOAT -> this;
        case R64G64_UINT -> this;
        case R64G64_SINT -> this;
        case R64G64_SFLOAT -> this;
        case R64G64B64_UINT -> this;
        case R64G64B64_SINT -> this;
        case R64G64B64_SFLOAT -> this;
        case R64G64B64A64_UINT -> this;
        case R64G64B64A64_SINT -> this;
        case R64G64B64A64_SFLOAT -> this;
        case B10G11R11_UFLOAT_PACK32 -> this;
        case E5B9G9R9_UFLOAT_PACK32 -> this;
        case D16_UNORM -> this;
        case X8_D24_UNORM_PACK32 -> this;
        case D32_SFLOAT -> this;
        case S8_UINT -> this;
        case D16_UNORM_S8_UINT -> this;
        case D24_UNORM_S8_UINT -> this;
        case D32_SFLOAT_S8_UINT -> this;
        case BC1_RGB_UNORM_BLOCK -> this;
        case BC1_RGB_SRGB_BLOCK -> this;
        case BC1_RGBA_UNORM_BLOCK -> this;
        case BC1_RGBA_SRGB_BLOCK -> this;
        case BC2_UNORM_BLOCK -> this;
        case BC2_SRGB_BLOCK -> this;
        case BC3_UNORM_BLOCK -> this;
        case BC3_SRGB_BLOCK -> this;
        case BC4_UNORM_BLOCK -> this;
        case BC4_SNORM_BLOCK -> this;
        case BC5_UNORM_BLOCK -> this;
        case BC5_SNORM_BLOCK -> this;
        case BC6H_UFLOAT_BLOCK -> this;
        case BC6H_SFLOAT_BLOCK -> this;
        case BC7_UNORM_BLOCK -> this;
        case BC7_SRGB_BLOCK -> this;
        case ETC2_R8G8B8_UNORM_BLOCK -> this;
        case ETC2_R8G8B8_SRGB_BLOCK -> this;
        case ETC2_R8G8B8A1_UNORM_BLOCK -> this;
        case ETC2_R8G8B8A1_SRGB_BLOCK -> this;
        case ETC2_R8G8B8A8_UNORM_BLOCK -> this;
        case ETC2_R8G8B8A8_SRGB_BLOCK -> this;
        case EAC_R11_UNORM_BLOCK -> this;
        case EAC_R11_SNORM_BLOCK -> this;
        case EAC_R11G11_UNORM_BLOCK -> this;
        case EAC_R11G11_SNORM_BLOCK -> this;
        case ASTC_4x4_UNORM_BLOCK -> this;
        case ASTC_4x4_SRGB_BLOCK -> this;
        case ASTC_5x4_UNORM_BLOCK -> this;
        case ASTC_5x4_SRGB_BLOCK -> this;
        case ASTC_5x5_UNORM_BLOCK -> this;
        case ASTC_5x5_SRGB_BLOCK -> this;
        case ASTC_6x5_UNORM_BLOCK -> this;
        case ASTC_6x5_SRGB_BLOCK -> this;
        case ASTC_6x6_UNORM_BLOCK -> this;
        case ASTC_6x6_SRGB_BLOCK -> this;
        case ASTC_8x5_UNORM_BLOCK -> this;
        case ASTC_8x5_SRGB_BLOCK -> this;
        case ASTC_8x6_UNORM_BLOCK -> this;
        case ASTC_8x6_SRGB_BLOCK -> this;
        case ASTC_8x8_UNORM_BLOCK -> this;
        case ASTC_8x8_SRGB_BLOCK -> this;
        case ASTC_10x5_UNORM_BLOCK -> this;
        case ASTC_10x5_SRGB_BLOCK -> this;
        case ASTC_10x6_UNORM_BLOCK -> this;
        case ASTC_10x6_SRGB_BLOCK -> this;
        case ASTC_10x8_UNORM_BLOCK -> this;
        case ASTC_10x8_SRGB_BLOCK -> this;
        case ASTC_10x10_UNORM_BLOCK -> this;
        case ASTC_10x10_SRGB_BLOCK -> this;
        case ASTC_12x10_UNORM_BLOCK -> this;
        case ASTC_12x10_SRGB_BLOCK -> this;
        case ASTC_12x12_UNORM_BLOCK -> this;
        case ASTC_12x12_SRGB_BLOCK -> this;
        case G8B8G8R8_422_UNORM -> this;
        case B8G8R8G8_422_UNORM -> this;
        case G8_B8_R8_3PLANE_420_UNORM -> switch (plane) {
            case 0 -> R8_UNORM;
            case 1 -> R8_UNORM;
            case 2 -> R8_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G8_B8R8_2PLANE_420_UNORM -> switch (plane) {
            case 0 -> R8_UNORM;
            case 1 -> R8G8_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G8_B8_R8_3PLANE_422_UNORM -> switch (plane) {
            case 0 -> R8_UNORM;
            case 1 -> R8_UNORM;
            case 2 -> R8_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G8_B8R8_2PLANE_422_UNORM -> switch (plane) {
            case 0 -> R8_UNORM;
            case 1 -> R8G8_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G8_B8_R8_3PLANE_444_UNORM -> switch (plane) {
            case 0 -> R8_UNORM;
            case 1 -> R8_UNORM;
            case 2 -> R8_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case R10X6_UNORM_PACK16 -> this;
        case R10X6G10X6_UNORM_2PACK16 -> this;
        case R10X6G10X6B10X6A10X6_UNORM_4PACK16 -> this;
        case G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 -> this;
        case B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 -> this;
        case G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R10X6_UNORM_PACK16;
            case 1 -> R10X6_UNORM_PACK16;
            case 2 -> R10X6_UNORM_PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R10X6_UNORM_PACK16;
            case 1 -> R10X6G10X6_UNORM_2PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R10X6_UNORM_PACK16;
            case 1 -> R10X6_UNORM_PACK16;
            case 2 -> R10X6_UNORM_PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R10X6_UNORM_PACK16;
            case 1 -> R10X6G10X6_UNORM_2PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R10X6_UNORM_PACK16;
            case 1 -> R10X6_UNORM_PACK16;
            case 2 -> R10X6_UNORM_PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case R12X4_UNORM_PACK16 -> this;
        case R12X4G12X4_UNORM_2PACK16 -> this;
        case R12X4G12X4B12X4A12X4_UNORM_4PACK16 -> this;
        case G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 -> this;
        case B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 -> this;
        case G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R12X4_UNORM_PACK16;
            case 1 -> R12X4_UNORM_PACK16;
            case 2 -> R12X4_UNORM_PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R12X4_UNORM_PACK16;
            case 1 -> R12X4G12X4_UNORM_2PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R12X4_UNORM_PACK16;
            case 1 -> R12X4_UNORM_PACK16;
            case 2 -> R12X4_UNORM_PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R12X4_UNORM_PACK16;
            case 1 -> R12X4G12X4_UNORM_2PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R12X4_UNORM_PACK16;
            case 1 -> R12X4_UNORM_PACK16;
            case 2 -> R12X4_UNORM_PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G16B16G16R16_422_UNORM -> this;
        case B16G16R16G16_422_UNORM -> this;
        case G16_B16_R16_3PLANE_420_UNORM -> switch (plane) {
            case 0 -> R16_UNORM;
            case 1 -> R16_UNORM;
            case 2 -> R16_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G16_B16R16_2PLANE_420_UNORM -> switch (plane) {
            case 0 -> R16_UNORM;
            case 1 -> R16G16_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G16_B16_R16_3PLANE_422_UNORM -> switch (plane) {
            case 0 -> R16_UNORM;
            case 1 -> R16_UNORM;
            case 2 -> R16_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G16_B16R16_2PLANE_422_UNORM -> switch (plane) {
            case 0 -> R16_UNORM;
            case 1 -> R16G16_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G16_B16_R16_3PLANE_444_UNORM -> switch (plane) {
            case 0 -> R16_UNORM;
            case 1 -> R16_UNORM;
            case 2 -> R16_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case PVRTC1_2BPP_UNORM_BLOCK_IMG -> this;
        case PVRTC1_4BPP_UNORM_BLOCK_IMG -> this;
        case PVRTC2_2BPP_UNORM_BLOCK_IMG -> this;
        case PVRTC2_4BPP_UNORM_BLOCK_IMG -> this;
        case PVRTC1_2BPP_SRGB_BLOCK_IMG -> this;
        case PVRTC1_4BPP_SRGB_BLOCK_IMG -> this;
        case PVRTC2_2BPP_SRGB_BLOCK_IMG -> this;
        case PVRTC2_4BPP_SRGB_BLOCK_IMG -> this;
        case ASTC_4x4_SFLOAT_BLOCK -> this;
        case ASTC_5x4_SFLOAT_BLOCK -> this;
        case ASTC_5x5_SFLOAT_BLOCK -> this;
        case ASTC_6x5_SFLOAT_BLOCK -> this;
        case ASTC_6x6_SFLOAT_BLOCK -> this;
        case ASTC_8x5_SFLOAT_BLOCK -> this;
        case ASTC_8x6_SFLOAT_BLOCK -> this;
        case ASTC_8x8_SFLOAT_BLOCK -> this;
        case ASTC_10x5_SFLOAT_BLOCK -> this;
        case ASTC_10x6_SFLOAT_BLOCK -> this;
        case ASTC_10x8_SFLOAT_BLOCK -> this;
        case ASTC_10x10_SFLOAT_BLOCK -> this;
        case ASTC_12x10_SFLOAT_BLOCK -> this;
        case ASTC_12x12_SFLOAT_BLOCK -> this;
        case G8_B8R8_2PLANE_444_UNORM -> switch (plane) {
            case 0 -> R8_UNORM;
            case 1 -> R8G8_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R10X6_UNORM_PACK16;
            case 1 -> R10X6G10X6_UNORM_2PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16 -> switch (plane) {
            case 0 -> R12X4_UNORM_PACK16;
            case 1 -> R12X4G12X4_UNORM_2PACK16;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G16_B16R16_2PLANE_444_UNORM -> switch (plane) {
            case 0 -> R16_UNORM;
            case 1 -> R16G16_UNORM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case A4R4G4B4_UNORM_PACK16 -> this;
        case A4B4G4R4_UNORM_PACK16 -> this;
        case R16G16_SFIXED5_NV -> this;
        case R10X6_UINT_PACK16_ARM -> this;
        case R10X6G10X6_UINT_2PACK16_ARM -> this;
        case R10X6G10X6B10X6A10X6_UINT_4PACK16_ARM -> this;
        case R12X4_UINT_PACK16_ARM -> this;
        case R12X4G12X4_UINT_2PACK16_ARM -> this;
        case R12X4G12X4B12X4A12X4_UINT_4PACK16_ARM -> this;
        case R14X2_UINT_PACK16_ARM -> this;
        case R14X2G14X2_UINT_2PACK16_ARM -> this;
        case R14X2G14X2B14X2A14X2_UINT_4PACK16_ARM -> this;
        case R14X2_UNORM_PACK16_ARM -> this;
        case R14X2G14X2_UNORM_2PACK16_ARM -> this;
        case R14X2G14X2B14X2A14X2_UNORM_4PACK16_ARM -> this;
        case G14X2_B14X2R14X2_2PLANE_420_UNORM_3PACK16_ARM -> switch (plane) {
            case 0 -> R14X2_UNORM_PACK16_ARM;
            case 1 -> R14X2G14X2_UNORM_2PACK16_ARM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case G14X2_B14X2R14X2_2PLANE_422_UNORM_3PACK16_ARM -> switch (plane) {
            case 0 -> R14X2_UNORM_PACK16_ARM;
            case 1 -> R14X2G14X2_UNORM_2PACK16_ARM;
            default -> throw new IllegalArgumentException("Unexpected plane " + plane + " for format " + this);
        };
        case R8_BOOL_ARM -> this;
    }; }
    /// The number of image planes of this format.
    public int planeCount() { return planeCount; }
    /// The relative height of this plane. A value of k means that this plane is 1/k the height of the overall format.
    public int planeHeightDivisor(int plane) { return planeHeightDivisor[plane]; }
    /// The relative width of this plane. A value of k means that this plane is 1/k the width of the overall format.
    public int planeWidthDivisor(int plane) { return planeWidthDivisor[plane]; }
    /// The number of texels in a texel block.
    public int texelsPerBlock() { return texelsPerBlock; }
}
