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

public enum VkFragmentShadingRateNV implements overrun.marshal.CEnum {
    1_INVOCATION_PER_PIXEL(0),
    1_INVOCATION_PER_1X2_PIXELS(1),
    1_INVOCATION_PER_2X1_PIXELS(4),
    1_INVOCATION_PER_2X2_PIXELS(5),
    1_INVOCATION_PER_2X4_PIXELS(6),
    1_INVOCATION_PER_4X2_PIXELS(9),
    1_INVOCATION_PER_4X4_PIXELS(10),
    2_INVOCATIONS_PER_PIXEL(11),
    4_INVOCATIONS_PER_PIXEL(12),
    8_INVOCATIONS_PER_PIXEL(13),
    16_INVOCATIONS_PER_PIXEL(14),
    NO_INVOCATIONS(15),
    ;
    private final int value;
    VkFragmentShadingRateNV(int value) { this.value = value; }
    @Override public int value() { return value; }
}
