/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

/**
 * The Vulkan binding.
 * @since 0.1.0
 */
public interface Vk10 extends overrun.marshal.DirectAccess {
    int MAX_PHYSICAL_DEVICE_NAME_SIZE = 256;
    int UUID_SIZE = 16;
    int LUID_SIZE = 8;
    int LUID_SIZE_KHR = LUID_SIZE;
    int MAX_EXTENSION_NAME_SIZE = 256;
    int MAX_DESCRIPTION_SIZE = 256;
    int MAX_MEMORY_TYPES = 32;
    int MAX_MEMORY_HEAPS = 16;
    float LOD_CLAMP_NONE = 1000.0F;
    int REMAINING_MIP_LEVELS = ~0;
    int REMAINING_ARRAY_LAYERS = ~0;
    int REMAINING_3D_SLICES_EXT = ~0;
    long WHOLE_SIZE = ~0;
    int ATTACHMENT_UNUSED = ~0;
    int TRUE = 1;
    int FALSE = 0;
    int QUEUE_FAMILY_IGNORED = ~0;
    int QUEUE_FAMILY_EXTERNAL = ~1;
    int QUEUE_FAMILY_EXTERNAL_KHR = QUEUE_FAMILY_EXTERNAL;
    int QUEUE_FAMILY_FOREIGN_EXT = ~2;
    int SUBPASS_EXTERNAL = ~0;
    int MAX_DEVICE_GROUP_SIZE = 32;
    int MAX_DEVICE_GROUP_SIZE_KHR = MAX_DEVICE_GROUP_SIZE;
    int MAX_DRIVER_NAME_SIZE = 256;
    int MAX_DRIVER_NAME_SIZE_KHR = MAX_DRIVER_NAME_SIZE;
    int MAX_DRIVER_INFO_SIZE = 256;
    int MAX_DRIVER_INFO_SIZE_KHR = MAX_DRIVER_INFO_SIZE;
    int SHADER_UNUSED_KHR = ~0;
    int SHADER_UNUSED_NV = SHADER_UNUSED_KHR;
    int MAX_GLOBAL_PRIORITY_SIZE_KHR = 16;
    int MAX_GLOBAL_PRIORITY_SIZE_EXT = MAX_GLOBAL_PRIORITY_SIZE_KHR;
    int MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT = 32;
    int MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR = 7;
    int SHADER_INDEX_UNUSED_AMDX = ~0;
}
