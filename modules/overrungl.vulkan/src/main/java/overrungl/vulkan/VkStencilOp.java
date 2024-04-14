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

public enum VkStencilOp implements overrun.marshal.CEnum {
    KEEP(0),
    ZERO(1),
    REPLACE(2),
    INCREMENT_AND_CLAMP(3),
    DECREMENT_AND_CLAMP(4),
    INVERT(5),
    INCREMENT_AND_WRAP(6),
    DECREMENT_AND_WRAP(7),
    ;
    private final int value;
    VkStencilOp(int value) { this.value = value; }
    @Override public int value() { return value; }
}
