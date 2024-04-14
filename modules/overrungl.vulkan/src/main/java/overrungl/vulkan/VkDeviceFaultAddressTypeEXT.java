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

public enum VkDeviceFaultAddressTypeEXT implements overrun.marshal.CEnum {
    /**
     * Currently unused
     */
    NONE(0),
    READ_INVALID(1),
    WRITE_INVALID(2),
    EXECUTE_INVALID(3),
    INSTRUCTION_POINTER_UNKNOWN(4),
    INSTRUCTION_POINTER_INVALID(5),
    INSTRUCTION_POINTER_FAULT(6),
    ;
    private final int value;
    VkDeviceFaultAddressTypeEXT(int value) { this.value = value; }
    @Override public int value() { return value; }
}
