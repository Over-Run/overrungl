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

public enum VkVendorId implements overrun.marshal.CEnum {
    /**
     * Vivante vendor ID
     */
    VIV(0x10001),
    /**
     * VeriSilicon vendor ID
     */
    VSI(0x10002),
    /**
     * Kazan Software Renderer
     */
    KAZAN(0x10003),
    /**
     * Codeplay Software Ltd. vendor ID
     */
    CODEPLAY(0x10004),
    /**
     * Mesa vendor ID
     */
    MESA(0x10005),
    /**
     * PoCL vendor ID
     */
    POCL(0x10006),
    /**
     * Mobileye vendor ID
     */
    MOBILEYE(0x10007),
    ;
    private final int value;
    VkVendorId(int value) { this.value = value; }
    @Override public int value() { return value; }
}
