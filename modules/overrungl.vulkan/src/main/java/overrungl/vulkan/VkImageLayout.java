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

public enum VkImageLayout implements overrun.marshal.CEnum {
    /**
     * Implicit layout an image is when its contents are undefined due to various reasons (e.g. right after creation)
     */
    UNDEFINED(0),
    /**
     * General layout when image can be used for any kind of access
     */
    GENERAL(1),
    /**
     * Optimal layout when image is only used for color attachment read/write
     */
    COLOR_ATTACHMENT_OPTIMAL(2),
    /**
     * Optimal layout when image is only used for depth/stencil attachment read/write
     */
    DEPTH_STENCIL_ATTACHMENT_OPTIMAL(3),
    /**
     * Optimal layout when image is used for read only depth/stencil attachment and shader access
     */
    DEPTH_STENCIL_READ_ONLY_OPTIMAL(4),
    /**
     * Optimal layout when image is used for read only shader access
     */
    SHADER_READ_ONLY_OPTIMAL(5),
    /**
     * Optimal layout when image is used only as source of transfer operations
     */
    TRANSFER_SRC_OPTIMAL(6),
    /**
     * Optimal layout when image is used only as destination of transfer operations
     */
    TRANSFER_DST_OPTIMAL(7),
    /**
     * Initial layout used when the data is populated by the CPU
     */
    PREINITIALIZED(8),
    ;
    private final int value;
    VkImageLayout(int value) { this.value = value; }
    @Override public int value() { return value; }
}
