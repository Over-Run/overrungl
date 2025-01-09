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
public class VKAMDDeviceCoherentMemory {
    public static final int VK_AMD_DEVICE_COHERENT_MEMORY_SPEC_VERSION = 1;
    public static final String VK_AMD_DEVICE_COHERENT_MEMORY_EXTENSION_NAME = "VK_AMD_device_coherent_memory";
    public static final int VK_MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD = 0x00000040;
    public static final int VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD = 0x00000080;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD = 1000229000;

    public VKAMDDeviceCoherentMemory(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
    }

}