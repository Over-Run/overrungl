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

public enum VkDebugReportObjectTypeEXT implements overrun.marshal.CEnum {
    UNKNOWN(0),
    INSTANCE(1),
    PHYSICAL_DEVICE(2),
    DEVICE(3),
    QUEUE(4),
    SEMAPHORE(5),
    COMMAND_BUFFER(6),
    FENCE(7),
    DEVICE_MEMORY(8),
    BUFFER(9),
    IMAGE(10),
    EVENT(11),
    QUERY_POOL(12),
    BUFFER_VIEW(13),
    IMAGE_VIEW(14),
    SHADER_MODULE(15),
    PIPELINE_CACHE(16),
    PIPELINE_LAYOUT(17),
    RENDER_PASS(18),
    PIPELINE(19),
    DESCRIPTOR_SET_LAYOUT(20),
    SAMPLER(21),
    DESCRIPTOR_POOL(22),
    DESCRIPTOR_SET(23),
    FRAMEBUFFER(24),
    COMMAND_POOL(25),
    SURFACE_KHR(26),
    SWAPCHAIN_KHR(27),
    DEBUG_REPORT_CALLBACK_EXT(28),
    DEBUG_REPORT(DEBUG_REPORT_CALLBACK_EXT.value),
    DISPLAY_KHR(29),
    DISPLAY_MODE_KHR(30),
    VALIDATION_CACHE_EXT(33),
    VALIDATION_CACHE(VALIDATION_CACHE_EXT.value),
    ;
    private final int value;
    VkDebugReportObjectTypeEXT(int value) { this.value = value; }
    @Override public int value() { return value; }
}
