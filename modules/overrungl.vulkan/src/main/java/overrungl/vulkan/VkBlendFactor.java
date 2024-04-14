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

public enum VkBlendFactor implements overrun.marshal.CEnum {
    ZERO(0),
    ONE(1),
    SRC_COLOR(2),
    ONE_MINUS_SRC_COLOR(3),
    DST_COLOR(4),
    ONE_MINUS_DST_COLOR(5),
    SRC_ALPHA(6),
    ONE_MINUS_SRC_ALPHA(7),
    DST_ALPHA(8),
    ONE_MINUS_DST_ALPHA(9),
    CONSTANT_COLOR(10),
    ONE_MINUS_CONSTANT_COLOR(11),
    CONSTANT_ALPHA(12),
    ONE_MINUS_CONSTANT_ALPHA(13),
    SRC_ALPHA_SATURATE(14),
    SRC1_COLOR(15),
    ONE_MINUS_SRC1_COLOR(16),
    SRC1_ALPHA(17),
    ONE_MINUS_SRC1_ALPHA(18),
    ;
    private final int value;
    VkBlendFactor(int value) { this.value = value; }
    @Override public int value() { return value; }
}
