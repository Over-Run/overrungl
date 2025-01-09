/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.vulkan.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKAMDMemoryOverallocationBehavior {
    public static final int VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD = 0;
    public static final int VK_MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD = 1;
    public static final int VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD = 2;
    public static final int VK_AMD_MEMORY_OVERALLOCATION_BEHAVIOR_SPEC_VERSION = 1;
    public static final String VK_AMD_MEMORY_OVERALLOCATION_BEHAVIOR_EXTENSION_NAME = "VK_AMD_memory_overallocation_behavior";
    public static final int VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD = 1000189000;

    public VKAMDMemoryOverallocationBehavior(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
    }

}
