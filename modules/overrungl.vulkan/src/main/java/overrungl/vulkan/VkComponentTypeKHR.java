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

public enum VkComponentTypeKHR implements overrun.marshal.CEnum {
    FLOAT16(0),
    FLOAT32(1),
    FLOAT64(2),
    SINT8(3),
    SINT16(4),
    SINT32(5),
    SINT64(6),
    UINT8(7),
    UINT16(8),
    UINT32(9),
    UINT64(10),
    ;
    private final int value;
    VkComponentTypeKHR(int value) { this.value = value; }
    @Override public int value() { return value; }
}
