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

public enum VkStructureType implements overrun.marshal.CEnum {
    APPLICATION_INFO(0),
    INSTANCE_CREATE_INFO(1),
    DEVICE_QUEUE_CREATE_INFO(2),
    DEVICE_CREATE_INFO(3),
    SUBMIT_INFO(4),
    MEMORY_ALLOCATE_INFO(5),
    MAPPED_MEMORY_RANGE(6),
    BIND_SPARSE_INFO(7),
    FENCE_CREATE_INFO(8),
    SEMAPHORE_CREATE_INFO(9),
    EVENT_CREATE_INFO(10),
    QUERY_POOL_CREATE_INFO(11),
    BUFFER_CREATE_INFO(12),
    BUFFER_VIEW_CREATE_INFO(13),
    IMAGE_CREATE_INFO(14),
    IMAGE_VIEW_CREATE_INFO(15),
    SHADER_MODULE_CREATE_INFO(16),
    PIPELINE_CACHE_CREATE_INFO(17),
    PIPELINE_SHADER_STAGE_CREATE_INFO(18),
    PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO(19),
    PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO(20),
    PIPELINE_TESSELLATION_STATE_CREATE_INFO(21),
    PIPELINE_VIEWPORT_STATE_CREATE_INFO(22),
    PIPELINE_RASTERIZATION_STATE_CREATE_INFO(23),
    PIPELINE_MULTISAMPLE_STATE_CREATE_INFO(24),
    PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO(25),
    PIPELINE_COLOR_BLEND_STATE_CREATE_INFO(26),
    PIPELINE_DYNAMIC_STATE_CREATE_INFO(27),
    GRAPHICS_PIPELINE_CREATE_INFO(28),
    COMPUTE_PIPELINE_CREATE_INFO(29),
    PIPELINE_LAYOUT_CREATE_INFO(30),
    SAMPLER_CREATE_INFO(31),
    DESCRIPTOR_SET_LAYOUT_CREATE_INFO(32),
    DESCRIPTOR_POOL_CREATE_INFO(33),
    DESCRIPTOR_SET_ALLOCATE_INFO(34),
    WRITE_DESCRIPTOR_SET(35),
    COPY_DESCRIPTOR_SET(36),
    FRAMEBUFFER_CREATE_INFO(37),
    RENDER_PASS_CREATE_INFO(38),
    COMMAND_POOL_CREATE_INFO(39),
    COMMAND_BUFFER_ALLOCATE_INFO(40),
    COMMAND_BUFFER_INHERITANCE_INFO(41),
    COMMAND_BUFFER_BEGIN_INFO(42),
    RENDER_PASS_BEGIN_INFO(43),
    BUFFER_MEMORY_BARRIER(44),
    IMAGE_MEMORY_BARRIER(45),
    MEMORY_BARRIER(46),
    /**
     * Reserved for internal use by the loader, layers, and ICDs
     */
    LOADER_INSTANCE_CREATE_INFO(47),
    /**
     * Reserved for internal use by the loader, layers, and ICDs
     */
    LOADER_DEVICE_CREATE_INFO(48),
    ;
    private final int value;
    VkStructureType(int value) { this.value = value; }
    @Override public int value() { return value; }
}
