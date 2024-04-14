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

public enum VkBorderColor implements overrun.marshal.CEnum {
    FLOAT_TRANSPARENT_BLACK(0),
    INT_TRANSPARENT_BLACK(1),
    FLOAT_OPAQUE_BLACK(2),
    INT_OPAQUE_BLACK(3),
    FLOAT_OPAQUE_WHITE(4),
    INT_OPAQUE_WHITE(5),
    ;
    private final int value;
    VkBorderColor(int value) { this.value = value; }
    @Override public int value() { return value; }
}
