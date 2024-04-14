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

public enum VkPrimitiveTopology implements overrun.marshal.CEnum {
    POINT_LIST(0),
    LINE_LIST(1),
    LINE_STRIP(2),
    TRIANGLE_LIST(3),
    TRIANGLE_STRIP(4),
    TRIANGLE_FAN(5),
    LINE_LIST_WITH_ADJACENCY(6),
    LINE_STRIP_WITH_ADJACENCY(7),
    TRIANGLE_LIST_WITH_ADJACENCY(8),
    TRIANGLE_STRIP_WITH_ADJACENCY(9),
    PATCH_LIST(10),
    ;
    private final int value;
    VkPrimitiveTopology(int value) { this.value = value; }
    @Override public int value() { return value; }
}
