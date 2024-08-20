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

public enum VkShadingRatePaletteEntryNV implements overrun.marshal.CEnum {
    NO_INVOCATIONS(0),
    _16_INVOCATIONS_PER_PIXEL(1),
    _8_INVOCATIONS_PER_PIXEL(2),
    _4_INVOCATIONS_PER_PIXEL(3),
    _2_INVOCATIONS_PER_PIXEL(4),
    _1_INVOCATION_PER_PIXEL(5),
    _1_INVOCATION_PER_2X1_PIXELS(6),
    _1_INVOCATION_PER_1X2_PIXELS(7),
    _1_INVOCATION_PER_2X2_PIXELS(8),
    _1_INVOCATION_PER_4X2_PIXELS(9),
    _1_INVOCATION_PER_2X4_PIXELS(10),
    _1_INVOCATION_PER_4X4_PIXELS(11),
    ;
    private final int value;
    VkShadingRatePaletteEntryNV(int value) { this.value = value; }
    @Override public int value() { return value; }
}
