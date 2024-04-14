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

public enum VkDescriptorType implements overrun.marshal.CEnum {
    SAMPLER(0),
    COMBINED_IMAGE_SAMPLER(1),
    SAMPLED_IMAGE(2),
    STORAGE_IMAGE(3),
    UNIFORM_TEXEL_BUFFER(4),
    STORAGE_TEXEL_BUFFER(5),
    UNIFORM_BUFFER(6),
    STORAGE_BUFFER(7),
    UNIFORM_BUFFER_DYNAMIC(8),
    STORAGE_BUFFER_DYNAMIC(9),
    INPUT_ATTACHMENT(10),
    ;
    private final int value;
    VkDescriptorType(int value) { this.value = value; }
    @Override public int value() { return value; }
}
