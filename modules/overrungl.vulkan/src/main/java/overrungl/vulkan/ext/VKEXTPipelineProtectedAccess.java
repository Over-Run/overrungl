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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.VK14.*;
public class VKEXTPipelineProtectedAccess {
    public static final int VK_EXT_PIPELINE_PROTECTED_ACCESS_SPEC_VERSION = 1;
    public static final String VK_EXT_PIPELINE_PROTECTED_ACCESS_EXTENSION_NAME = "VK_EXT_pipeline_protected_access";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES_EXT = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES;
    public static final int VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT_EXT = VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT;
    public static final int VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT_EXT = VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT;

    public VKEXTPipelineProtectedAccess(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
    }

}