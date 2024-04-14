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

public enum VkPerformanceCounterUnitKHR implements overrun.marshal.CEnum {
    GENERIC(0),
    PERCENTAGE(1),
    NANOSECONDS(2),
    BYTES(3),
    BYTES_PER_SECOND(4),
    KELVIN(5),
    WATTS(6),
    VOLTS(7),
    AMPS(8),
    HERTZ(9),
    CYCLES(10),
    ;
    private final int value;
    VkPerformanceCounterUnitKHR(int value) { this.value = value; }
    @Override public int value() { return value; }
}
