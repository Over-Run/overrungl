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

public enum VkCubicFilterWeightsQCOM implements overrun.marshal.CEnum {
    CATMULL_ROM(0),
    ZERO_TANGENT_CARDINAL(1),
    B_SPLINE(2),
    MITCHELL_NETRAVALI(3),
    ;
    private final int value;
    VkCubicFilterWeightsQCOM(int value) { this.value = value; }
    @Override public int value() { return value; }
}
