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

public enum VkPerformanceCounterScopeKHR implements overrun.marshal.CEnum {
    COMMAND_BUFFER(0),
    RENDER_PASS(1),
    COMMAND(2),
    QUERY_SCOPE_COMMAND_BUFFER(COMMAND_BUFFER.value),
    QUERY_SCOPE_RENDER_PASS(RENDER_PASS.value),
    QUERY_SCOPE_COMMAND(COMMAND.value),
    ;
    private final int value;
    VkPerformanceCounterScopeKHR(int value) { this.value = value; }
    @Override public int value() { return value; }
}
