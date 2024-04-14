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

public enum VkLogicOp implements overrun.marshal.CEnum {
    CLEAR(0),
    AND(1),
    AND_REVERSE(2),
    COPY(3),
    AND_INVERTED(4),
    NO_OP(5),
    XOR(6),
    OR(7),
    NOR(8),
    EQUIVALENT(9),
    INVERT(10),
    OR_REVERSE(11),
    COPY_INVERTED(12),
    OR_INVERTED(13),
    NAND(14),
    SET(15),
    ;
    private final int value;
    VkLogicOp(int value) { this.value = value; }
    @Override public int value() { return value; }
}
