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

public enum VkLatencyMarkerNV implements overrun.marshal.CEnum {
    SIMULATION_START(0),
    SIMULATION_END(1),
    RENDERSUBMIT_START(2),
    RENDERSUBMIT_END(3),
    PRESENT_START(4),
    PRESENT_END(5),
    INPUT_SAMPLE(6),
    TRIGGER_FLASH(7),
    OUT_OF_BAND_RENDERSUBMIT_START(8),
    OUT_OF_BAND_RENDERSUBMIT_END(9),
    OUT_OF_BAND_PRESENT_START(10),
    OUT_OF_BAND_PRESENT_END(11),
    ;
    private final int value;
    VkLatencyMarkerNV(int value) { this.value = value; }
    @Override public int value() { return value; }
}
